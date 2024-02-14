package at.ram.units.oo.examples.cars;

public class Car {
    private String color;
    private int maxSpeed;
    private double basePrice;
    private double baseConsumption;
    private Producer producer;
    private Engine engine;


    public Car(String color, int maxSpeed, double basePrice, double baseConsumption, Producer producer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.producer = producer;
        this.engine = engine;
    }

    public double price() {
        double discountPrice = basePrice * (1 - producer.getDiscount() / 100);
        return discountPrice;
    }

    public double consumption(double distance) {
        if (distance <= 50000) {
            return baseConsumption;
        } else {
            return baseConsumption * 1.098;
        }
    }

}