package at.ram.units.oo.examples.cars;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Toyota", "Japan", 10); // 10% discount
        Engine engine = new Engine(at.ram.units.oo.examples.cars.Engine.TYPE.DIESEL, 150);
        Car car = new Car("Blue", 200, 25000, 6.5, producer, engine);

        System.out.println("Car Price: " + car.Price());
        System.out.println("Fuel Consumption for 60000 km: " + car.Consumption(60000));
    }
}