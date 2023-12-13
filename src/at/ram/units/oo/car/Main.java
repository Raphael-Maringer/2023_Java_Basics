package at.ram.units.oo.car;

import at.ram.units.oo.car.Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car(3, 70, "Audi", "A1234",
                "red", 3, 70);

        Car c2 = new Car(6, 20, "Mercedes", "M1234",
                "white", 1, 280);


        System.out.println(c1.getBrand());
        c1.drive();
        c1.brake();
        c1.turboboost();
        c1.honk(honkAmount);
        System.out.println(c1.getFuelAmount());
        System.out.println(c1.getFuelAmount());
        c1.honk(3);


        System.out.println(c2.getBrand());
        c2.drive();
        c2.brake();
        c2.turboboost();
        c2.honk();
        System.out.println(c2.getFuelAmount());
        System.out.println(c2.getFuelAmount());
        c2.honk(4);
    }

}
