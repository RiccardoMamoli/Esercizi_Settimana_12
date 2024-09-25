package Stampa_Due_Rettangoli;

class rettangoli {
    private double altezza1;
    private double larghezza1;
    private double altezza2;
    private double larghezza2;


    public rettangoli (double altezza1, double larghezza1, double altezza2, double larghezza2){
        this.altezza1 = altezza1;
        this.altezza2 = altezza2;
        this.larghezza1 = larghezza1;
        this.larghezza2 = larghezza2;

    }

    public double getArea1() {
        return altezza1 * larghezza1;
    }

    public double getArea2() {
        return  altezza2 * larghezza2;
    }

    public double getPer1() {
        return  altezza1 + larghezza1;
    }

    public double getPer2() {
        return altezza2 + larghezza2;
    }

    public double sumPers() {
        return getPer1() + getPer2();
    }

    public double sumAreas() {
        return getArea1() + getArea2();
    }

}
