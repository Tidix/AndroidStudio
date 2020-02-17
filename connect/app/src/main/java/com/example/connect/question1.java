package com.example.connect;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jfa.connect1.R;

public class question1 extends AppCompatActivity {

    private RadioGroup group;
    private RadioButton rb1;
    private RadioButton rb2;
    private Button bouton;
    private String ReponseValide;
    private int nbRepVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1);
        // -----ReponseValide = getString(R.string.rbQ1Rep1);
        group = findViewById(R.id.radioGroup);
    }

    public void valider(View v){
        if(rb1.isChecked())
            Session.getInstance().incrementerScore();
        else
            Session.getInstance().incrementerNbDeQuestionsRepondues();


    }




}
