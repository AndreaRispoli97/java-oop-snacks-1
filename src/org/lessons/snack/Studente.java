package org.lessons.snack;

public class Studente {
    // attributi
    private String nome;
    private String cognome;
    private int età;

    // costruttore
    public Studente(String nome, String cognome, int età) {

        this.nome = nome;
        this.cognome = cognome;
        this.età = età;

    }

    // metodi

    public String valoriCompleta() {
        return this.nome + " " + this.cognome + ", " + this.età + " anni";
    }
}
