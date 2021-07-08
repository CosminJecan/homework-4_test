package ro.siit.homework6;

public class Main {
    public static void main(String[] args) {

        CalculatePrice pret1 = new CalculatePrice(177.58);
        System.out.println("Pretul total = " + pret1.calculatePrice() + ";");

        CalculatePrice pret2 = new CalculatePrice(358.2);
        System.out.println("Pretul total = " + pret2.calculatePrice() + ";");
    }
}
