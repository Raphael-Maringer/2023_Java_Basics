package at.ram.units.oo.examples.inheritance;

public class Truck extends Car {
    private String trailer;
    public Truck(Engine engine, Tank tank, String brand, String serialNumber, String color, int honkAmount, String Trailer) {
        super(engine, tank, brand, serialNumber, color, honkAmount);
    }
}
