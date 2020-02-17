package com.example.connect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jfa.connect1.R;

public class question3 extends AppCompatActivity {

    private String EXTRA_LOGIN;
    private String EXTRA_SCORE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_3);
        Intent intent = getIntent();
        TextView loginDisplay = findViewById(R.id.loginQ3);
        final String login;
        final int score;
        login = intent.getStringExtra(EXTRA_LOGIN);
        score = intent.getIntExtra(EXTRA_SCORE, 0);
        loginDisplay.setText("Bonjour "+login+" score : " + score);

        Button Vrai = findViewById(R.id.Vrai);
        Vrai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final int score2 = score + 1;
                Intent intent = new Intent(question3.this,
                        question4.class);
                intent.putExtra(EXTRA_LOGIN, login);
                intent.putExtra(EXTRA_SCORE, score2);
                startActivity(intent);
            }
        });
        Button Faux = findViewById(R.id.Vrai);
        Faux.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final int score2 = score + 0;
                Intent intent = new Intent(question3.this,
                        question4.class);
                intent.putExtra(EXTRA_LOGIN, login);
                intent.putExtra(EXTRA_SCORE, score2);
                startActivity(intent);
            }
        });
    }

}
