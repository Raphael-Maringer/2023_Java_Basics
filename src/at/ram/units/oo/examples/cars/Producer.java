package at.ram.units.oo.examples.cars;

public class Producer {
    private String name;
    private String origin;
    private double discount;

    public Producer(String name, String origin, double discount) {
        this.name = name;
        this.origin = origin;
        this.discount = discount;
    }

    public double getDiscount(){
    return discount;
    }
}