package com.example.connect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jfa.connect1.R;

public class question4 extends AppCompatActivity {

    private RadioGroup group;
    private RadioButton rb1;
    private RadioButton rb2;
    private Button bouton;
    private String EXTRA_LOGIN;
    private String EXTRA_SCORE;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_4);
        Intent intent = getIntent();
        TextView loginDisplay = findViewById(R.id.loginQ4);
        final String login = intent.getStringExtra(EXTRA_LOGIN);
        final int score = intent.getIntExtra(EXTRA_SCORE, 0);
        loginDisplay.setText("Bonjour "+login+" votre score : " + score);


        Button but = findViewById(R.id.ValiderQ4);
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final int score2 = score + valider();
                Intent intent = new Intent(question4.this, MainActivity.class); // ça ne fonctionne pas de toute façon, et j'en ai marre
                intent.putExtra(EXTRA_LOGIN, login);
                intent.putExtra(EXTRA_SCORE, score2);
                startActivity(intent);
            }
        });

        group = findViewById(R.id.radioGroup);

    }

    public int valider(){
        if(rb2.isChecked())
            return 1;
        else
            return 0;
    }


}
