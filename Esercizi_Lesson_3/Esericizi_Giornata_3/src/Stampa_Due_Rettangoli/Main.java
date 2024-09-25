package Stampa_Due_Rettangoli;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci altezza primo rettangolo: ");
        double altezza1 = sc.nextDouble();
        System.out.println("Inserisci larghezza primo rettangolo: ");
        double larghezza1 = sc.nextDouble();
        System.out.println("Inserisci altezza secondo rettangolo: ");
        double altezza2 = sc.nextDouble();
        System.out.println("Inserisci larghezza secondo rettangolo: ");
        double larghezza2 = sc.nextDouble();
        rettangoli rettangoli = new rettangoli (altezza1, larghezza1, altezza2, larghezza2);
        System.out.println("L'area del primo rettangolo è: " + rettangoli.getArea1());
        System.out.println("Il perimetro del primo rettangolo è: " + rettangoli.getPer1());
        System.out.println("L'area del secondo rettangolo è: " + rettangoli.getArea2());
        System.out.println("Il perimetro del secondo rettangolo è: " + rettangoli.getPer2());
    }
}
