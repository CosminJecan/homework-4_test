package ro.siit.homework11;


public class Student {
    private String nume, prenume, facultate, specializare;
    private int numarRestante;
    private double medieAn;
    private double notaExamen;

    public Student(String nume, String prenume, String facultate, String specializare) {
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.specializare = specializare;
    }

    public Student(int numarRestante) {

        this.numarRestante = numarRestante;
    }
    public Student(double medieAn) {

        this.medieAn = medieAn;
    }

    public Student(double medieAn, int numarRestante) {
        this.medieAn = medieAn;
        this.numarRestante = numarRestante;
    }

    public boolean conditiePromovareExamen() {
        if (notaExamen >= 5.0) {
            return true;
        } else {
            return false;
        }
    }
    public String calculPromovareAn() {
        if (medieAn >= 5.0) {
            return "promovat";
        } else {
            return "restant";
        }
    }

    public boolean conditieBursa() {
       if(medieAn >= 9.0 && numarRestante == 0) {
           return true;
       } else {
           return false;
       }
    }

    public int adaugaRestante(double notaExamen, int numarRestante){
        if(notaExamen<5.0) {
            return (numarRestante + 1);
        } else {
            return numarRestante;
        }
    }
}