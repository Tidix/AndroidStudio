package com.example.connect;

public class Identifiants {
    private String id;
    private String mdp;

    public Identifiants(String id, String mdp){
        this.id = id;
        this.mdp = mdp;
    }

    public boolean identifier(String id, String mdp){
        return (this.id == id && this.mdp == mdp);
    }



}
