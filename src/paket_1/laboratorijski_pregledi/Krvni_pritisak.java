package paket_1.laboratorijski_pregledi;

import java.util.Date;

/**
 * Created by Nikola on 6/16/2017.
 */
public class Krvni_pritisak {
    private int  gornjaVrednost;
    private int donjaVrednost;
    private int puls;
    private Date datumZakazivanja;

    public Krvni_pritisak(int gornjaVrednost, int donjaVrednost, int puls, Date date) {
        this.gornjaVrednost = gornjaVrednost;
        this.donjaVrednost = donjaVrednost;
        this.puls = puls;
        this.datumZakazivanja=new Date();
    }

    public int getGornjaVrednost() {
        return gornjaVrednost;
    }

    public void setGornjaVrednost(int gornjaVrednost) {
        this.gornjaVrednost = gornjaVrednost;
    }

    public int getDonjaVrednost() {
        return donjaVrednost;
    }

    public void setDonjaVrednost(int donjaVrednost) {
        this.donjaVrednost = donjaVrednost;
    }

    public int getPuls() {
        return puls;
    }

    public void setPuls(int puls) {
        this.puls = puls;
    }

    public Date getDatumZakazivanja() {
        return datumZakazivanja;
    }

    public void setDatumZakazivanja(Date datumZakazivanja) {
        this.datumZakazivanja = datumZakazivanja;
    }

    @Override
    public String toString() {
        return "Krvni_pritisak{" +
                "gornjaVrednost=" + gornjaVrednost +
                ", donjaVrednost=" + donjaVrednost +
                ", puls=" + puls +
                ", datumZakazivanja=" + datumZakazivanja +
                '}';
    }
}
