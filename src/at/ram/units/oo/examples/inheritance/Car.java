package at.ram.units.oo.examples.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tire> tires;
    private Tank tank;
    private String brand;
    private String serialNumber;
    private String color;
    private int honkAmount;
    private int speed;

    public Car(Engine engine, Tank tank, String brand, String serialNumber, String color, int honkAmount) {
        this.engine = engine;
        this.tank = tank;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.honkAmount = honkAmount;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void brake() {
        System.out.println("I am breaking ..... car");
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuut");
        }
    }

    public void drive() {
        this.engine.setSpeed(this.speed);
        this.engine.drive();

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turboboost() {
        this.engine.turboboost();
    }

    public void getRemainingRange() {
        this.engine.getRemainingRange();
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void addTire(Tire tire) {
        this.tires.add(tire);
    }

    public void rotate() {
        for (RearMirror mirror : mirrors) {
            mirror.rotate();
        }
    }

    public void changeSeason() {
        for (Tire tire : tires) {
            tire.changeSeason();
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHonkAmount() {
        return honkAmount;
    }

    public void setHonkAmount(int honkAmount) {
        this.honkAmount = honkAmount;
    }

    public int getSpeed() {
        return speed;
    }
}