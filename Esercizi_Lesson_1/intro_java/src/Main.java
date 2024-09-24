//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int resMoltiplica = moltiplica(4, 3);
    System.out.println("Il risultato è " + resMoltiplica );
    }

    public static int moltiplica(int x, int y) {
    return x * y;
    }

    public static String concatena(String str, int x) {
    return "Ciao" + name + "ho" + age + "anni";
    }

    public static int inserisciArray(String[] arr, String str) {
        String[] arrStr = new String[6];
        for(int i = 0; i < arr.length; i++) {
            if(i == 3) {
                arrStr[3] = str;
            } else {
                arrStr[i] = arr[i];
            }
        }

        return arrStr;
    }
}