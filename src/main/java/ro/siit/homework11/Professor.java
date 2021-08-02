package ro.siit.homework11;

import java.util.Calendar;

public class Professor {
    private String nume, prenume, catedra;
    private double salariuIncadrare;
    private int anAngajare;


    public Professor(String nume, String prenume, String catedra) {
        this.nume = nume;
        this.prenume = prenume;
        this.catedra = catedra;
    }

    public Professor(int anAngajare) {
        this.anAngajare = anAngajare;
    }

    public Professor(double salariuIncadrare, int anAngajare) {
        this.salariuIncadrare = salariuIncadrare;
        this.anAngajare = anAngajare;
    }


    public int calculVechime() {
        int anCurent = Calendar.getInstance().get(Calendar.YEAR);
        return (anCurent-this.anAngajare);
    }


    public double calculSalariu(double salariuIncadrare, int anAngajare) {
        if (calculVechime() >= 0 && calculVechime() < 5) {
            return salariuIncadrare;
        } if (calculVechime() >= 5 && calculVechime() < 10) {
            return salariuIncadrare + (salariuIncadrare * 0.05);
        } if (calculVechime() >= 10 && calculVechime() < 15) {
            return salariuIncadrare + (salariuIncadrare * 0.10);
        } else {
            return salariuIncadrare + (salariuIncadrare * 0.15);
        }
    }
}