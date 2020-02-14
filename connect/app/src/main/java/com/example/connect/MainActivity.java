package com.example.connect;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN = "user_login";
    final String EXTRA_PASSWORD = "user_password";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText login = (EditText) findViewById(R.id.user_email);
        final EditText pass = (EditText) findViewById(R.id.user_password);
        final Button loginButton = (Button) findViewById(R.id.connect);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        LoginDisplayActivity.class);
                intent.putExtra(EXTRA_LOGIN, login.getText().toString());
                intent.putExtra(EXTRA_PASSWORD, pass.getText().toString());
                startActivity(intent);
            }
        });
    }
}