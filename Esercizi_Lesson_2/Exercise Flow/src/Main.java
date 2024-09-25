import Esercizio_Switch.Esercizio_Switch;
import Primi_Due_Esercizi.Primi_Due_Esercizi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Primi_Due_Esercizi sol = new Primi_Due_Esercizi();
        System.out.println("La stringa è pari? " + sol.PariDispari("Ciao"));

        Esercizio_Switch sol2 = new Esercizio_Switch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3: ");
        int num = sc.nextInt();
        System.out.println("Il numero di lettere è " + sol2.stampaNum(num));
    }

}

