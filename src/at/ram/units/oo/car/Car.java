package at.ram.units.oo.car;

public class Car {
    private Engine engine;
    private Tank tank;
    private String brand;
    private String serialNumber;
    private String color;
    private int honkAmount;
    public Tank fuelAmount;
    public Tank fuelConsumption;
    public Tank tankVolume;

    public Car(Engine engine, Tank tank, String brand, String serialNumber, String color, int honkAmount) {
        this.engine = engine;
        this.tank = tank;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.honkAmount = honkAmount;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving with " + fuelAmount + "l fuel remaining");
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void turboboost() {
        double fuelPercentage = fuelAmount / (double) tankVolume * 100.0;
        if (fuelPercentage > 10) {
            System.out.println("SuperBoostMode");
        } else System.out.println("Not enough fuel to go to Superboost");
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuut");
        }
    }

    public void getRemainingRange() {
        double remainingRange = (double) fuelAmount / fuelConsumption;
        System.out.println("The car has a remaining range of " + remainingRange + " km");
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
}
