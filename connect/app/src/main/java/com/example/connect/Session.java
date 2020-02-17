package com.example.connect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Session {

    static private Session instance;

    private int score;

    private int nbDeQuestionsRepondues;

    private boolean[] questionsRepondues;

    private String identifiant;

    private String motDePasse;

    public final int nombreDeQuestionsTotales = 5;

    public Session(String id, String mdp) {
        this.identifiant = id;
        this.score = 0;
        this.nbDeQuestionsRepondues = 0;
        this.instance = this;
        this.questionsRepondues = new boolean[5];
        for (int i=0; i<5; i++) questionsRepondues[i] = false;
    }

    static public Session getInstance(){
        return instance;
    }

    public void incrementerScore(){
        this.score++;
    }

    public int getScore() {
        return score;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getNbDeQuestionsRepondues() {
        return nbDeQuestionsRepondues;
    }

    public void incrementerNbDeQuestionsRepondues() {
        this.nbDeQuestionsRepondues++;
    }

    public boolean getQuestionRepondues(int i) {
        return this.questionsRepondues[i];
    }

    public void setQuestionTrue(int i) {
        this.questionsRepondues[i] = true;
    }
}
