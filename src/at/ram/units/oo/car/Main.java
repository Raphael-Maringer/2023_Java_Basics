package at.ram.units.oo.car;
import at.ram.units.oo.car.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.fuelConsumption = 7;
        c1.fuelAmount = 70;
        c1.brand = "Audi";
        c1.serialNumber = "A1234";

        Car c2 = new Car();
        c2.fuelConsumption = 6;
        c2.fuelAmount = 20;
        c2.brand = "Mercedes";
        c2.serialNumber = "M1234";

        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

        System.out.println("--------------------");

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
    }

}
