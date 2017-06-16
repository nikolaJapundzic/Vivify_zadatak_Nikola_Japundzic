package paket_1.laboratorijski_pregledi;

import paket_1.Doktor;
import paket_1.Pacijent;

import java.util.Date;

/**
 * Created by Nikola on 6/16/2017.
 */
public class Simulaciona_skripta {
    public static void main(String[] args) {
        System.out.println("Kreiranje doktora");
        Doktor d1 = new Doktor("Milan", "Milanovic", "Opsta praksa");
        System.out.println("Doktor je kreiran\n");

        System.out.println("Kreiranje pacijenta");
        Pacijent p1 = new Pacijent("Dragan", "Draganovic", 1234567890, 1);
        System.out.println("Pacijent je kreiran\n");

        System.out.println("Pacijent " + p1 + " bira doktora " + d1);
        p1.setDoktor(d1);
        System.out.println("Pacijent " + p1 + " je izabrao doktora " + p1.getDoktor() + "\n");

        System.out.println("Doktor " + d1 + " treba da pregleda pacijenta " + p1);
        d1.setPacijenti(p1);
        System.out.println("Pacijent" + d1.getPacijenti() + " je dosao na pregled kod doktora " + d1 + "\n");

        System.out.println("Doktor "+ d1.getIme() +" zakazuje preglede");
        d1.setPreglednivoSeceraUKrvi(new Nivo_secera_u_krvi( 32.2, "pre 18 casova", new Date()), p1);
        d1.setPregledkrvniPritisak(new Krvni_pritisak(160, 180, 88, new Date()), p1);
        System.out.println(d1);
        System.out.println("Doktor "+ d1.getIme() + " je obavio preglede pacijenta " +d1.getPacijenti().getIme());

    }
}
