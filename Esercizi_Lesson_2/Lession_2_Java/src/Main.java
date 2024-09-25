import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prime stampe!");
        test(24 , "Ciao");
        String str = test2(300,  "Ciao");
        System.out.println(str);


        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un mese:");
        int m = Integer.parseInt(sc.nextLine());
        String mese = getMese(m);
        System.out.println("Il mese è " + mese);
    }

    public static void test(int x, String y) {
        System.out.println(y + " " + x);
    }

    public static String test2(int x, String y) {
        if(y.length() > 5){
            return x + " " + y;
        } else {
            return "---";
        }
    }

    public static String getMese(int m) {
        return switch (m) {
            case 1 -> "Gennaio";
            case 2 -> "Febbraio";
            case 3 -> "Marzo";
            case 4 -> "Aprile";
            case 5 -> "Maggio";
            case 6 -> "Giugno";
            case 7 -> "Luglio";
            case 8 -> "Agosto";
            case 9 -> "Settembre";
            case 10 -> "Ottobre";
            case 11 -> "Novembre";
            case 12 -> "Dicembre";
            default -> "Valore Errato";
        };
    }
}
