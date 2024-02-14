package at.ram.units.oo.examples.remote;

public class Remote {
    private Battery b1;
    private Battery b2;

    public Remote(Battery b1, Battery b2) {
        this.b1 = b1;
        this.b2 = b2;
    }

    public double getStatus() {
        double averageStatus = (b1.getStatus() + b2.getStatus()) / 2;
        return averageStatus;
    }

    public void turnOn() {
        b1.turnOn();
        b2.turnOn();
    }

    public void turnOff() {
        b1.turnOff();
        b2.turnOff();
    }
}