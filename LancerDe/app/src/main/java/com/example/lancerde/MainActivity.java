package com.example.lancerde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView score;
    private ImageView d1;
    private ImageView d2;
    private ImageView d3;
    private int vd1;
    private int vd2;
    private int vd3;
    private int scor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }

    public void bLancer(View v){
        lancer(1);
    }

    public void lancer(int nde){
        vd1 = (int) (Math.random()%6 +1);
        vd2 = (int) (Math.random()%6 +1);
        vd3 = (int) (Math.random()%6 +1);
        //changerImage();
        scoring();
    }

    public void scoring(){
        scor = vd1 + vd2 + vd3;
        score.setText("Score du lancer de dé : " + vd1 + " + " + vd2 + " + " + vd3 + " = " + scor);
    }

    public void changerImage(){
        switch(vd1){
            default:
            case 2:
                //faut changer l'image selon la valeur lel
            case 3:
            case 4:
            case 5:
            case 6:
        }
        switch(vd2){
            default:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
        }
        switch(vd3){
            default:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
        }
    }

    public void initiate(){
        button = findViewById(R.id.bouton);
        score = findViewById(R.id.score);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);

        //d1.setImageResource(R.drawable.dice_1);
        //d2.setImageResource(R.drawable.dice_1);
        //d3.setImageResource(R.drawable.dice_1);
    }
}
