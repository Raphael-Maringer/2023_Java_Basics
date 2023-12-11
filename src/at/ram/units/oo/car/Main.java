package at.ram.units.oo.car;

import at.ram.units.oo.car.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelAmount(70);
        c1.setFuelConsumption(30);
        c1.setSerialNumber("A1234");
        c1.setHonkAmount(3);
        c1.setFuelVolume(70);

/*        Car c2 = new Car();
        c2.fuelConsumption = 6;
        c2.fuelAmount = 20;
        c2.brand = "Mercedes";
        c2.serialNumber = "M1234";
        c2.honkAmount = 1;
        c2.fuelVolume = 280;
*/
        Car c3 = new Car(17, "Opel", "1234O");


        System.out.println(c1.getFuelAmount());

        /*
        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

        System.out.println("--------------------");

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);

        c1.brake();

        c1.turboboost();
        c2.turboboost();
        c1.honk(c1.honkAmount);

        System.out.println("-------------------");

        c1.getRemainingRange();

        c1.drive();

        c1.getRemainingRange();
    */

    }

}
