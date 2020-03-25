package com.example.contact;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jfa.connect1.R;

public class ContactAdd extends AppCompatActivity {

    String nom;
    String prenom;
    String email;
    int num;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addcontact);
    }


    public void AjoutContact(){
        // ajouter le contact dans le Json
    }
}
