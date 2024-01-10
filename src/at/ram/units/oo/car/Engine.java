package at.ram.units.oo.car;

import org.w3c.dom.ls.LSOutput;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type;        // Diesel oder Benzin

    public Engine(int horsePower, TYPE type){
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int amount) {
        System.out.println("The motor is running with "+ amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
