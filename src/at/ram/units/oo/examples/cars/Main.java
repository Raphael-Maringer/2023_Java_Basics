package at.ram.units.oo.examples.cars;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Toyota", "Japan", 10);
        Engine engine = new Engine(Engine.TYPE.DIESEL, 150);
        Car car = new Car("Blue", 200, 25000, 6.5, producer, engine);

        System.out.println("Car Price: " + Helper.format(car.price()) + " €");
        // System.out.println("Fuel Consumption for 60.000 km: " + car.consumption(60000));
        System.out.println("Fuel Consumption for 60.000 km: " + Helper.format(car.consumption(60000)) + " km");
    }
}