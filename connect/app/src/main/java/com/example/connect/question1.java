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

public class question1 extends AppCompatActivity {

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
        setContentView(R.layout.question_1);
        Intent intent = getIntent();
        TextView loginDisplay = findViewById(R.id.loginQ1);
        final String login = intent.getStringExtra(EXTRA_LOGIN);
        loginDisplay.setText("Bonjour "+login);
        Button but = findViewById(R.id.ValiderQ1);

        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                score = valider();
                Intent intent = new Intent(question1.this,
                        question2.class);
                intent.putExtra(EXTRA_LOGIN, login);
                intent.putExtra(EXTRA_SCORE, score);
                startActivity(intent);
            }
        });

        group = findViewById(R.id.radioGroup);

    }

    public int valider(){
        if(rb1.isChecked())
            return 1;
        else
            return 0;
    }


}
