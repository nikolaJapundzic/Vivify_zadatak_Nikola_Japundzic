package paket_1;

/**
 * Created by Nikola on 6/16/2017.
 */
public class Pacijent extends Osoba {

    private long JMBG;
    private int brojZdravstvenog_kartona;
    private Doktor doktor;

    public Pacijent(String ime, String prezime, long JMBG, int brojZdravstvenog_kartona) {
        super(ime, prezime);
        this.JMBG=JMBG;
        this.brojZdravstvenog_kartona=brojZdravstvenog_kartona;
    }

    public long getJMBG() {
        return JMBG;
    }

    public void setJMBG(long JMBG) {
        this.JMBG = JMBG;
    }

    public int getBrojZdravstvenog_kartona() {
        return brojZdravstvenog_kartona;
    }

    public void setBrojZdravstvenog_kartona(int brojZdravstvenog_kartona) {
        this.brojZdravstvenog_kartona = brojZdravstvenog_kartona;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    @Override
    public String toString() {
        return "Pacijent{" +
                "Ime=" + getIme() +
                "JMBG=" + JMBG +
                ", brojZdravstvenog_kartona=" + brojZdravstvenog_kartona + +
                '}';
    }
}
