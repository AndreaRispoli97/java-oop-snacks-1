package org.lessons.snack;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // snack 1
        Studente primoStudente = new Studente("Andrea", "Rispoli", 28);
        Studente primoStudente1 = new Studente("Andrea", "Rispoli", 28);
        Studente primoStudente2 = new Studente("Andrea", "Rispoli", 28);
        Studente primoStudente3 = new Studente("Andrea", "Rispoli", 28);
        Studente primoStudente4 = new Studente("Andrea", "Rispoli", 28);

        System.out.println("======================= Snack 1 =======================");
        System.out.println(primoStudente.valoriCompleta());

        // snack 2
        ContoBancario contoCorrente = new ContoBancario(123456789);
        System.out.println("======================= Snack 2 =======================");
        contoCorrente.deposito(new BigDecimal(500));
        contoCorrente.preleva(new BigDecimal(50));
        System.out.println(contoCorrente.getSaldo());
        System.out.println(contoCorrente.numero_conto());

        // snack 3
        RegistroStudenti listStudenti = new RegistroStudenti();
        System.out.println("======================= Snack 3 =======================");
        listStudenti.nuovoStudente(primoStudente);
        listStudenti.nuovoStudente(primoStudente1);
        listStudenti.nuovoStudente(primoStudente2);
        listStudenti.nuovoStudente(primoStudente3);
        listStudenti.nuovoStudente(primoStudente4);
        // listStudenti.getStudenti();
        System.out.println(listStudenti.getStudenti());

    }
}
