package com.example.connect;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jfa.connect1.R;

public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";
    private EditText login;
    private EditText mdp;
    private Button loginButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.user_email);
        mdp = (EditText) findViewById(R.id.user_password);
        loginButton = (Button) findViewById(R.id.connect);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        LoginDisplayActivity.class);
                intent.putExtra(EXTRA_LOGIN, login.getText().toString());
                intent.putExtra(EXTRA_PASSWORD, mdp.getText().toString());
                startActivity(intent);
            }
        });
    }
}