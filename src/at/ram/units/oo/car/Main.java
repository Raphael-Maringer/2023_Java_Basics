package at.ram.units.oo.car;

import at.ram.units.oo.car.Car;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(150, Engine.TYPE.GAS);
        Engine e2 = new Engine(90,Engine.TYPE.DIESEL);

        Car c1 = new Car(e1,3, 70, "Audi", "A1234",
                "red", 3, 70);

        Car c2 = new Car(e2,6, 20, "Mercedes", "M1234",
                "white", 1, 280);

    }

}
