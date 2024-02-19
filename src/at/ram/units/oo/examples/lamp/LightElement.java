package at.ram.units.oo.examples.lamp;

public class LightElement {
    public String name;
    private String color;
    private int powerConsumption;
    private enum status {on, off}

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

    public void turnOn() {
        if (status = true) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet.");
        } else {
            System.out.println("Einschalten: " + name);
            status = true;
            powerConsumption += 5; }
    }
}


