package at.ram.units.oo.examples.remote;

public class Battery {
    private double status;

    public Battery() {
        this.status = 100;
    }

    public double getStatus() {
        return status;
    }

    public void turnOn() {
        status -= 5;
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }
}