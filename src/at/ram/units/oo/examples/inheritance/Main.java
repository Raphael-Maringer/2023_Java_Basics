package at.ram.units.oo.examples.inheritance;

public class Main {
    public static void main(String[] args) {

        Tank t1 = new Tank(70, 70, 8);
        Tank t2 = new Tank(125, 125, 12);

        Engine e1 = new Engine(150, Engine.TYPE.GAS, t1);
        Engine e2 = new Engine(90, Engine.TYPE.DIESEL, t2);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Tire ti1 = new Tire(12, "Rubber", true);
        Tire ti2 = new Tire(16, "Steel", false);
        Tire ti3 = new Tire(16, "Steel", false);
        Tire ti4 = new Tire(20, "Wood", true);

        Car c1 = new Car(e1, t1, "Audi", "A1234", "red", 2);
        // Car c2 = new Car(e2, t2, "Mercedes", "M1234", "white", 3);

        Truck truck1 = new Truck(e2, t2, "Volvo", "DEF321", "red", 1, "trailer1");

        System.out.println(truck1.getColor() + truck1.getTrailer());


        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTire(ti1);
        c1.addTire(ti2);
        c1.addTire(ti3);
        c1.addTire(ti4);

        c1.setSpeed(50);
        c1.drive();
        c1.brake();
        c1.turboboost();
        c1.honk(2);
        c1.getRemainingRange();
        System.out.println(c1.getMirrors().get(0).getPosition());
        c1.rotate();
        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getTires().get(0).getSeason());
        c1.changeSeason();
        System.out.println(c1.getTires().get(0).getSeason());
    }
}