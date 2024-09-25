package Esercizio_Switch;

public class Esercizio_Switch {
    public static String stampaNum(int num) {
        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due"); // Corretto da "Tre" a "Due"
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                return "Errore: numero fuori dall'intervallo (0-3).";
        }
    }
}
