package Stampa_Rettangolo;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci l'altezza: ");
        double altezza = sc.nextDouble();
        System.out.print("Inserisci la larghezza:" );
        double larghezza = sc.nextDouble();
        Rettangolo rettangolo = new Rettangolo(altezza, larghezza);
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.calcPer());
        System.out.println("Stampa del rettangolo: ");
        rettangolo.StampaRet();
    }

}
