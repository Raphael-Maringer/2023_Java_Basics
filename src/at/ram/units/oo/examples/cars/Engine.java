package at.ram.units.oo.examples.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private TYPE type;
    private int horsepower;

    public Engine(TYPE fuelType, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }
}