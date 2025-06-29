package org.lessons.snack;

import java.math.BigDecimal;

public class ContoBancario {
    // attributi

    private int numero_conto;
    private BigDecimal saldo;

    // costruttore
    public ContoBancario(int numero_conto) {
        this.numero_conto = numero_conto;
        this.saldo = BigDecimal.ZERO;
    }

    // metodi
    public void deposito(BigDecimal importo) {
        if (importo.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Deposito non riuscito");
        } else {
            this.saldo = this.saldo.add(importo);
            System.out.println("Deposito di " + importo + " completato. Nuovo Saldo: " + this.saldo);
        }
    }

    public void preleva(BigDecimal importo) {
        if (saldo.compareTo(importo) >= 0) {
            this.saldo = this.saldo.subtract(importo);
            System.out.println("Prelievo di " + importo + " completato. Nuovo Saldo: " + this.saldo);
        } else {
            System.out.println("Non c'hai i sordi fratè");
        }
    }

    // Get
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public int numero_conto() {
        return this.numero_conto;
    }
}
