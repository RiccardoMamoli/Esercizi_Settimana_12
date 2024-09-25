package SIM;

import java.util.ArrayList;
import java.util.List;  // Devi importare List

// Rinomino CHIAMATA a Chiamata per coerenza
class Chiamata {
    private int durata;
    private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumber() {
        return numeroChiamato;
    }

    @Override
    public String toString() {
        return "Chiamata [durata: " + durata + " minuti, numero: " + numeroChiamato + "]";
    }
}

class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> chiamate;

    // Costruttore che inizializza il numero di telefono e la lista di chiamate vuota
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;  // Inizializzo credito a 0
        this.chiamate = new ArrayList<>();  // Inizializzo la lista di chiamate
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime chiamate effettuate:");

        // Controllo se ci sono chiamate da mostrare
        if (chiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata chiamata : chiamate) {
                System.out.println(chiamata);  // Usa il toString della classe Chiamata
            }
        }
    }

    // Metodo per aggiungere una chiamata alla lista
    public void aggiungiChiamata(int durata, String numeroChiamato) {
        if (chiamate.size() == 5) {
            chiamate.remove(0);  // Rimuove la chiamata più vecchia
        }
        chiamate.add(new Chiamata(durata, numeroChiamato));  // Aggiunge una nuova chiamata
    }
}
