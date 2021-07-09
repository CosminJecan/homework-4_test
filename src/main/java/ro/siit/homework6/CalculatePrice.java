package ro.siit.homework6;

public class CalculatePrice {
    private double price;
    private int vat = 19;

    public double calculatePrice() {
        return (price + (price * vat / 100));
    }

    public CalculatePrice(double pret) {
        this.price = pret;
    }
}
