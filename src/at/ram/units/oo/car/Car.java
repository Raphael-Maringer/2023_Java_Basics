package at.ram.units.oo.car;

public class Car {
    private Engine engine;
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
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuut");
        }
    }

    public void drive(){
        this.engine.setSpeed(this.speed);
        this.engine.drive();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turboboost(){
        this.engine.turboboost();
    }

    public void getRemainingRange(){
        this.engine.getRemainingRange();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHonkAmount(int honkAmount) {
        this.honkAmount = honkAmount;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getHonkAmount() {
        return honkAmount;
    }

    public String SerialNumber() {
        return serialNumber;
    }

    public Tank getTank() {
        return tank;
    }

    public Engine getEngine() {
        return engine;
    }
}