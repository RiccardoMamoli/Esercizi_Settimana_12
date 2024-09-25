package SIM;

public class Main {
    public static void main(String[] args) {
        // Creazione di una nuova SIM
        SIM miaSIM = new SIM("1234567890");

        // Aggiungo alcune chiamate
        miaSIM.aggiungiChiamata(5, "0987654321");
        miaSIM.aggiungiChiamata(3, "0123456789");
        miaSIM.aggiungiChiamata(10, "1112223333");

        // Stampo i dati della SIM
        miaSIM.stampaDatiSim();
    }
}
