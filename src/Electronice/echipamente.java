package Electronice;

public class echipamente {

    private final String denumire;

    private final int nr_inv;

    private final int pret;

    private final int zona_mag;


    private Stare stare;


    public echipamente(String denumire, int nr_inv, int pret, int zona_mag, Stare stare) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.stare = stare;
    }

    @Override
    public String toString() {
        return "echipamente{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag=" + zona_mag +
                ", stare=" + stare +
                '}';
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public int getPret() {
        return pret;
    }

    public int getZona_mag() {
        return zona_mag;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }
}
