package com.example.lancerde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView score;
    ImageView d1;
    ImageView d2;
    ImageView d3;
    int vd1;
    int vd2;
    int vd3;




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
        vd1 = (int)Math.random()%6 +1;
        vd2 = (int)Math.random()%6 +1;
        vd3 = (int)Math.random()%6 +1;
        changerImage();

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

        d1.setImageResource(R.drawable.dice_1);
        d2.setImageResource(R.drawable.dice_1);
        d3.setImageResource(R.drawable.dice_1);
    }
}
