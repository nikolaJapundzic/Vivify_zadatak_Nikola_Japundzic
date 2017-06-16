package paket_1.laboratorijski_pregledi;

import java.util.Date;

/**
 * Created by Nikola on 6/16/2017.
 */
public class Nivo_holesterola_u_krvi {
    private double vrednost;
    private String vremePoslednjegObroka;
    private Date datumZakazivanja;

    public Nivo_holesterola_u_krvi(double vrednost, String vremePoslednjegObroka) {
        this.vrednost = vrednost;
        this.vremePoslednjegObroka = vremePoslednjegObroka;
        this.datumZakazivanja=new Date();
    }

    public double getVrednost() {
        return vrednost;
    }

    public void setVrednost(double vrednost) {
        this.vrednost = vrednost;
    }

    public String getVremePoslednjegObroka() {
        return vremePoslednjegObroka;
    }

    public void setVremePoslednjegObroka(String vremePoslednjegObroka) {
        this.vremePoslednjegObroka = vremePoslednjegObroka;
    }

    public Date getDatumZakazivanja() {
        return datumZakazivanja;
    }

    public void setDatumZakazivanja(Date datumZakazivanja) {
        this.datumZakazivanja = datumZakazivanja;
    }

    @Override
    public String toString() {
        return "Nivo_holesterola_u_krvi{" +
                "vrednost=" + vrednost +
                ", vremePoslednjegObroka='" + vremePoslednjegObroka + '\'' +
                ", datumZakazivanja=" + datumZakazivanja +
                '}';
    }
}
