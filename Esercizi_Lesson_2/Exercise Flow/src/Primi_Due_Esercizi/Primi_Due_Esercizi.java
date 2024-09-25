package Primi_Due_Esercizi;

public class Primi_Due_Esercizi {

    public boolean PariDispari(String x) {
        return x.length() % 2 == 0 ? true : false;
    }

    public boolean annoBisestile( int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return false;
        } else if (anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
