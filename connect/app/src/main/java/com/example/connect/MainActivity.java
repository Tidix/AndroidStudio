package com.example.connect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Identifiants> identifiants;
    private EditText id;
    private EditText mdp;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }

    /*public void connection(View v){
        String idd = id.getText();
        while(identifiants.get(i).identifier())
    }*/



    public void initiate(){
        //id =findViewById(R.id.id);
        //mdp = findViewById(R.id.mdp);
    }


}
