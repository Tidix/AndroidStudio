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

public class question2 extends AppCompatActivity {

    private CheckBox CB1;
    private CheckBox CB2;
    private CheckBox CB3;
    private CheckBox CB4;
    private String EXTRA_LOGIN;
    private String EXTRA_SCORE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_2);
        CB1 = findViewById(R.id.checkbox1);
        CB2 = findViewById(R.id.checkbox2);
        CB3 = findViewById(R.id.checkbox3);
        CB4 = findViewById(R.id.checkbox4);
        Intent intent = getIntent();
        TextView loginDisplay = findViewById(R.id.loginQ2);
        final String login;
        final int score;
        login = intent.getStringExtra(EXTRA_LOGIN);
        score = intent.getIntExtra(EXTRA_SCORE, 0);
        loginDisplay.setText("Bonjour "+login+" score : " + score);

        Button but = findViewById(R.id.ValiderQ2);
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final int score2 = score + valider();
                Intent intent = new Intent(question2.this,
                        question3.class);
                intent.putExtra(EXTRA_LOGIN, login);
                intent.putExtra(EXTRA_SCORE, score2);
                startActivity(intent);
            }
        });
    }


    public int valider(){
        if (CB1.isChecked() && CB2.isChecked() && CB3.isChecked())
            return 1;
        else
            return 0;
    }



            /*
                 super.onCreate(savedInstanceState);
                 setContentView(R.layout.login_display);
                 Intent intent = getIntent();
                 TextView loginDisplay = (TextView)
                findViewById(R.id.email_display);
                 TextView passwordDisplay = (TextView)
                findViewById(R.id.password_display);
                 if (intent != null) {
                 loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));

                passwordDisplay.setText(intent.getStringExtra(EXTRA_PASSWORD));
 }
 }
             */


}
