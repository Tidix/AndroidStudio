package com.example.lancerde;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;


import com.bumptech.glide.Glide;

import java.io.File;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView score;
    private ImageView d1;
    private ImageView d2;
    private ImageView d3;
    private int vd1 = 1;
    private int vd2 = 1;
    private int vd3 = 1;
    private int scor;

    private MediaPlayer explosion;

    SensorManager sensor;
    private float mAccel, mAccelCurrent, mAccelLast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }

    public void bLancer(View v){lancer();}
    public void bLancerD1(View v){lancerD1();}
    public void bLancerD2(View v){lancerD2();}
    public void bLancerD3(View v){lancerD3();}

    public void lancer(){
        onPause();
        button.setEnabled(false);
        Glide.with(this).load(R.drawable.explosion).into(d3);
        Glide.with(this).load(R.drawable.explosion).into(d1);
        Glide.with(this).load(R.drawable.explosion).into(d2);
        explosion();
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {

                lancerD1();
                lancerD2();
                lancerD3();
                button.setEnabled(true);
                onResume();
            }
        }, 500);
    }

    private final SensorEventListener sensorListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];
            mAccelLast = mAccelCurrent;
            mAccelCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
            float delta = mAccelCurrent - mAccelLast;
            mAccel = mAccel * 0.9f + delta;
            if (mAccel > 8) {
                lancer();
            }
        }
        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };


    public void scoring() {
        String texte = "\n\n";
        if(vd1 == vd2 && vd1 == vd3)
            texte = "Triple ! \n\n";
        else {
            if (vd1 == vd2 || vd2 == vd3 || vd1 == vd3)
                texte = "Double !  \n\n";

        }
        scor = vd1 + vd2 + vd3;
        texte = texte + "Score du lancer de dé : \n\n" + vd1 + " + " + vd2 + " + " + vd3 + "\n" + scor;
        score.setText(texte);
    }

    public void lancerD1(){
        vd1 = (int)(Math.random()*6 +1);
        switch(vd1){
            default:
                Glide.with(this).load(R.drawable.dice_1).into(d1);
                break;
            case 2:
                Glide.with(this).load(R.drawable.dice_2).into(d1);
                break;
            case 3:
                Glide.with(this).load(R.drawable.dice_3).into(d1);
                break;
            case 4:
                Glide.with(this).load(R.drawable.dice_4).into(d1);
                break;
            case 5:
                Glide.with(this).load(R.drawable.dice_5).into(d1);
                break;
            case 6:
                Glide.with(this).load(R.drawable.dice_6).into(d1);
                break;
        }
        scoring();
    }

    public void lancerD2(){
        vd2 = (int) (Math.random()*6 +1);
        switch(vd2){
            default:
                Glide.with(this).load(R.drawable.dice_1).into(d2);
                break;
            case 2:
                Glide.with(this).load(R.drawable.dice_2).into(d2);
                break;
            case 3:
                Glide.with(this).load(R.drawable.dice_3).into(d2);
                break;
            case 4:
                Glide.with(this).load(R.drawable.dice_4).into(d2);
                break;
            case 5:
                Glide.with(this).load(R.drawable.dice_5).into(d2);
                break;
            case 6:
                Glide.with(this).load(R.drawable.dice_6).into(d2);
                break;
        }
        scoring();
    }

    public void lancerD3(){
        vd3 = (int) (Math.random()*6 +1);
        switch(vd3){
            default:
                Glide.with(this).load(R.drawable.dice_1).into(d3);
                break;
            case 2:
                Glide.with(this).load(R.drawable.dice_2).into(d3);
                break;
            case 3:
                Glide.with(this).load(R.drawable.dice_3).into(d3);
                break;
            case 4:
                Glide.with(this).load(R.drawable.dice_4).into(d3);
                break;
            case 5:
                Glide.with(this).load(R.drawable.dice_5).into(d3);
                break;
            case 6:
                Glide.with(this).load(R.drawable.dice_6).into(d3);
                break;
        }
        scoring();
    }

    public void explosion(){
        if(explosion.isPlaying()){
            explosion.stop();
            explosion.release();
            explosion = MediaPlayer.create(this, R.raw.explosion);
        }
        explosion.start();
    }

    @Override
    protected void onResume() {
        sensor.registerListener(sensorListener, sensor.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), sensor.SENSOR_DELAY_NORMAL);
        super.onResume();
    }
    @Override
    protected void onPause() {
        sensor.unregisterListener(sensorListener);
        super.onPause();
    }

    public void initiate(){
        button = findViewById(R.id.bouton);
        score = findViewById(R.id.score);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        explosion = MediaPlayer.create(this, R.raw.explosion);
        // prit d'internet :o
        sensor = (SensorManager) getSystemService(this.SENSOR_SERVICE);
        Objects.requireNonNull(sensor).registerListener(sensorListener, sensor.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
        mAccel = 10f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;

        Glide.with(this).load(R.drawable.dice_1).into(d1);
        Glide.with(this).load(R.drawable.dice_1).into(d2);
        Glide.with(this).load(R.drawable.dice_1).into(d3);

    }
}
