package at.ram.units.oo.examples.lamp;

import at.ram.units.oo.car.Engine;
import at.ram.units.oo.car.Tank;

public class Main {
    public String name;
    private String color;
    private Engine.TYPE type;
    private int powerConsumption;
    private enum status {on, off}
    private Tank tank;
    private int speed;

    public Engine(int horsePower, Engine.TYPE type, Tank tank){
        this.horsePower = horsePower;
        this.type = type;
        this.tank = tank;
        this.speed = 0;
    }
}
