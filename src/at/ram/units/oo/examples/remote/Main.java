package at.ram.units.oo.examples.remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery();
        Battery b2 = new Battery();

        Remote remote = new Remote(b1, b2);

        b1.turnOn();
        b1.turnOff();
        System.out.println("Aktueller Ladestatus: " + remote.getStatus());
    }
}