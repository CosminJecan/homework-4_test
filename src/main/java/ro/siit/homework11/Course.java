package ro.siit.homework11;

public class Course {
    private String catedra, domeniuActivitate;
    private double numarOreCurs;
    private String tipCurs; // tip: curs, seminar, laborator


    public Course(String catedra, String domeniuActivitate) {
        this.catedra = catedra;
        this.domeniuActivitate = domeniuActivitate;
    }

    public void setTipCurs(String tipCurs) {
        this.tipCurs = tipCurs;
    }

    public void setNumarOreCurs(double numarOreCurs) {
        this.numarOreCurs = numarOreCurs;
    }


    public double calculOreSaptamanal(double numarOreCurs){
        double numarSaptamaniSemenstru = 17;
        return numarOreCurs / numarSaptamaniSemenstru;
    }
}