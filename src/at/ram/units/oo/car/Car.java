package at.ram.units.oo.car;

public class Car {
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int honkAmount;
    private int fuelVolume;

    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving with " + fuelAmount + " l fuel remaining");
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void turboboost() {
        double fuelPercentage = fuelAmount / (double) fuelVolume * 100.0;
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

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
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

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public int getHonkAmount() {
        return honkAmount;
    }

    public String SerialNumber() {
        return serialNumber;
    }
}
