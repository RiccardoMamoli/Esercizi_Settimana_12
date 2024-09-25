package Stampa_Rettangolo;

import java.util.Scanner;

class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcPer() {
        return 2 * (altezza + larghezza);
    }

    public void StampaRet() {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < larghezza; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
