package at.ram.units.oo.car;

import at.ram.units.oo.car.Car;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(150, Engine.TYPE.GAS);
        Engine e2 = new Engine(90,Engine.TYPE.DIESEL);

        Tank t1 = new Tank(70, 70, 8);
        Tank t2 = new Tank(125, 125, 12);


        Car c1 = new Car(e1,t1, "Audi", "A1234", "red",
                2);

        Car c2 = new Car(e2,t2, "Mercedes", "M1234", "white",
                3);
    }

}
