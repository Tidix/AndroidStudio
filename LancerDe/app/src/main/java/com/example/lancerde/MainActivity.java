package com.example.lancerde;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;


import com.bumptech.glide.Glide;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView score;
    private ImageView d1;
    private ImageView d2;
    private ImageView d3;
    private int vd1 = 2;
    private int vd2 = 2;
    private int vd3 = 3;
    private int scor;
    private MediaPlayer explosion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }

    public void bLancer(View v){
        lancer(v);
    }

    public void lancer(View v){
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
            }
        }, 500);
    }

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



    public void initiate(){
        button = findViewById(R.id.bouton);
        score = findViewById(R.id.score);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        explosion = MediaPlayer.create(this, R.raw.explosion);

        Glide.with(this).load(R.drawable.dice_1).into(d1);
        Glide.with(this).load(R.drawable.dice_1).into(d2);
        Glide.with(this).load(R.drawable.dice_1).into(d3);

    }
}
