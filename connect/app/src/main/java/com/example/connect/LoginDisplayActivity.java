package com.example.connect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jfa.connect1.R;

public class LoginDisplayActivity extends Activity {

    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";
    private Button commencer;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_display);

        Intent intent = getIntent();
        final TextView loginDisplay = (TextView)
                findViewById(R.id.email_display);
        TextView passwordDisplay = (TextView)
                findViewById(R.id.password_display);
        if (intent != null) {
            loginDisplay.setText(intent.getStringExtra(EXTRA_LOGIN));
            passwordDisplay.setText(intent.getStringExtra(EXTRA_PASSWORD));
        }


        commencer = findViewById(R.id.QCM);
        commencer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginDisplayActivity.this,
                        question1.class);
                intent.putExtra(EXTRA_LOGIN, loginDisplay.getText().toString());
                startActivity(intent);
            }
        });

    }

}