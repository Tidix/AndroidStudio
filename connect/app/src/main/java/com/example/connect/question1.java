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
    private String ReponseValide;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1);
        // -----ReponseValide = getString(R.string.rbQ1Rep1);

        Intent intent = getIntent();
        TextView logindisp = findViewById(R.id.loginQ1);
        logindisp.setText("bonjour "+session.getIdentifiant());
        group = findViewById(R.id.radioGroup);
    }

    public void valider(View v){
        if(rb1.isChecked())
            Session.getInstance().incrementerScore();
        else
            Session.getInstance().incrementerNbDeQuestionsRepondues();


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
