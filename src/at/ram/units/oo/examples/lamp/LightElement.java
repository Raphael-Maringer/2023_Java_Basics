package at.ram.units.oo.examples.lamp;

public class LightElement {
    public String name;
    private String color;
    private int powerConsumption;
    private Status status;

    public enum Status {on, off}

    public LightElement(String name, String color, int powerConsumption, Status status) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void turnOn() {
        if (this.status == Status.on) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet.");
        } else {
            System.out.println("Einschalten: " + name);
            this.status = status.on;
            powerConsumption += 5;
        }
    }


}