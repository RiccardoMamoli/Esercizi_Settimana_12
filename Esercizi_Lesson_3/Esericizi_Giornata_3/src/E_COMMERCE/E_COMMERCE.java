package E_COMMERCE;

import java.time.LocalDate;
import java.util.List;

class Articolo {
    private String codiceArticolo;
    private String descArticolo;
    private double prezzoArticolo;
    private int dispArticolo;

    public Articolo(String codiceArticolo, String descArticolo, double prezzoArticolo, int dispArticolo) {
     this.codiceArticolo = codiceArticolo;
     this.descArticolo = descArticolo;
     this.prezzoArticolo = prezzoArticolo;
     this.dispArticolo = dispArticolo;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescArticolo() {
        return descArticolo;
    }

    public double getPrezzoArticolo() {
        return prezzoArticolo;
    }

    public int getDispArticolo() {
        return dispArticolo;
    }

    public void aggiornaDisp(int pezziVenduti) {
        this.dispArticolo -= pezziVenduti;
    }

    @Override
    public String toString() {
        return "Articolo: " + descArticolo + " (Codice: " + codiceArticolo + "), Prezzo: " + prezzoArticolo + "€, Disponibili: " + dispArticolo;
    }


}

class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIsc;

    public Cliente (String codiceCliente, String nome, String cognome, String email, LocalDate dataIsc){
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIsc = dataIsc;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataIscrizione() {
        return dataIsc;
    }
    @Override
    public String toString() {
        return "Cliente: " + nome + " " + cognome + " (Codice: " + codiceCliente + "), Email: " + email + ", Iscritto dal: " + dataIsc;
    }

}

class Carrello {
    private Cliente cliente;
    private List<Articolo> articoli;
}
