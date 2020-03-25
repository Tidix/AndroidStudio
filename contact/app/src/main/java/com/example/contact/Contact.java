package com.example.contact;

public class Contact {

    String nom;
    String prenom;
    int num;
    String email;


    public Contact(String nom, String prenom, int num, String email){
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.email = email;
    }

    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getEmail(){
        return email;
    }
    public int getNumero(){
        return num;
    }

}
