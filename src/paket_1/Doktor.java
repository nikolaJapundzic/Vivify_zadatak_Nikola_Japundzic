package paket_1;

import paket_1.laboratorijski_pregledi.Krvni_pritisak;
import paket_1.laboratorijski_pregledi.Nivo_holesterola_u_krvi;
import paket_1.laboratorijski_pregledi.Nivo_secera_u_krvi;

import java.util.ArrayList;

/**
 * Created by Nikola on 6/16/2017.
 */
public class Doktor extends Osoba {


    private String specijalnost;
    private Pacijent pacijenti;

    private Krvni_pritisak PregledkrvniPritisak;
    private Nivo_secera_u_krvi PreglednivoSeceraUKrvi;
    private Nivo_holesterola_u_krvi PregledNivoHolestelerolaUKrvi;

    public Doktor(String ime, String prezime, String specijalnost) {
        super(ime, prezime);
        this.specijalnost = specijalnost;

    }

    public String getSpecijalnost() {
        return specijalnost;
    }

    public void setSpecijalnost(String specijalnost) {
        this.specijalnost = specijalnost;
    }

    public Pacijent getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(Pacijent pacijenti) {
        this.pacijenti = pacijenti;
    }

    public Krvni_pritisak getPregledkrvniPritisak() {
        return PregledkrvniPritisak;
    }

    public void setPregledkrvniPritisak(Krvni_pritisak pregledkrvniPritisak, Pacijent pacijent) {
        PregledkrvniPritisak = pregledkrvniPritisak;
    }

    public Nivo_secera_u_krvi getPreglednivoSeceraUKrvi() {
        return PreglednivoSeceraUKrvi;
    }

    public void setPreglednivoSeceraUKrvi(Nivo_secera_u_krvi preglednivoSeceraUKrvi, Pacijent pacijent) {
        PreglednivoSeceraUKrvi = preglednivoSeceraUKrvi;
        pacijent = this.getPacijenti();
    }

    public Nivo_holesterola_u_krvi getPregledNivoHolestelerolaUKrvi() {
        return PregledNivoHolestelerolaUKrvi;
    }

    public void setPregledNivoHolestelerolaUKrvi(Nivo_holesterola_u_krvi pregledNivoHolestelerolaUKrvi, Pacijent pacijent) {
        PregledNivoHolestelerolaUKrvi = pregledNivoHolestelerolaUKrvi;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "specijalnost='" + specijalnost + '\'' +
                ", pacijenti=" + pacijenti +
                ", PregledkrvniPritisak=" + PregledkrvniPritisak +
                ", PreglednivoSeceraUKrvi=" + PreglednivoSeceraUKrvi +
                ", PregledNivoHolestelerolaUKrvi=" + PregledNivoHolestelerolaUKrvi +
                '}';
    }
}
