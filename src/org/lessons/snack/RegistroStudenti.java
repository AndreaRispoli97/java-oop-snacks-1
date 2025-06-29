package org.lessons.snack;

public class RegistroStudenti {
    // attributi
    private Studente[] studenti;

    // costruttore
    public RegistroStudenti() {

        this.studenti = new Studente[0];
    }

    // metodi
    public void nuovoStudente(Studente newStud) {
        Studente[] newArray = new Studente[this.studenti.length + 1];
        for (int i = 0; i < this.studenti.length; i++) {
            newArray[i] = this.studenti[i];
        }
        newArray[newArray.length - 1] = newStud;
        this.studenti = newArray;
    }

    public void getStudenti() {
        for (Studente studente : studenti) {
            System.out.println(studente.valoriCompleta());
        }
    }
}
