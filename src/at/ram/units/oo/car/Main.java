package at.ram.units.oo.car;

import at.ram.units.oo.car.Car;
import at.ram.units.oo.car.Engine;
import at.ram.units.oo.car.Tank;

public class Main {
    public static void main(String[] args) {

        Tank t1 = new Tank(70, 70, 8);
        Tank t2 = new Tank(125, 125, 12);

        Engine e1 = new Engine(150, Engine.TYPE.GAS, t1);
        Engine e2 = new Engine(90,Engine.TYPE.DIESEL, t2);

        Car c1 = new Car(e1,t1, "Audi", "A1234", "red",
                2);

        Car c2 = new Car(e2,t2, "Mercedes", "M1234", "white",
                3);

        c1.setSpeed(50);
        c1.drive();
        c1.brake();
        c1.turboboost();
        c1.honk(2);
        c1.getRemainingRange();
    }
}