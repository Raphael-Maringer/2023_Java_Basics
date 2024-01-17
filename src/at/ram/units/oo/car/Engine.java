package at.ram.units.oo.car;

import org.w3c.dom.ls.LSOutput;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type;        // Diesel oder Benzin
    private Tank tank;
    private int speed;

    public Engine(int horsePower, TYPE type, Tank tank){
        this.horsePower = horsePower;
        this.type = type;
        this.tank = tank;
        this.speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void drive() {
        double multiplicator = 0.1;
        int fuelToConsume = this.speed * this.tank.getFuelConsumption();
        fuelToConsume *= multiplicator;
        if (this.tank.getFuelAmount() >= fuelToConsume) {
            this.tank.setFuelAmount(this.tank.getFuelAmount() - fuelToConsume);
            System.out.println("The motor is running with speed " + speed + " and " + this.tank.getFuelAmount() + "l fuel remaining");
        } else {
            System.out.println("Not enough fuel left");
        }
    }

    public void turboboost() {
        double fuelPercentage = this.tank.getFuelAmount() / (double) this.tank.getTankVolume() * 100.0;
        if (fuelPercentage > 10) {
            System.out.println("SuperBoostMode");
        } else System.out.println("Not enough fuel to go to Superboost");
    }

    public void getRemainingRange() {
        double remainingRange = (double) this.tank.getFuelAmount() / this.tank.getFuelConsumption();
        System.out.println("The car has a remaining range of " + remainingRange + " km");
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
