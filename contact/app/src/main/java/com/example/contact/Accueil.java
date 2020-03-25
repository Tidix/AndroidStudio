package com.example.contact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jfa.connect1.R;

public class Accueil extends AppCompatActivity {


    private Button bAjout;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        bAjout = (Button) findViewById(R.id.bAjout);
        bAjout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accueil.this,
                        ContactAdd.class);
                startActivity(intent);
            }
        });




    }
}
