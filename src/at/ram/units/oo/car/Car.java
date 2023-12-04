package at.ram.units.oo.car;

public class Car {
    /*int fuelConsumption;
    public int fuelAmount;
    String brand;
    String serialNumber;
    private String color;
    int honkAmount;
    int fuelVolume;
    private double fuelConsumption;
    private String serialNumber;
    private double fuelAmount;
    private int honAmount;
    private String color;   */

    public void drive(){
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving with " + fuelAmount + " l fuel remaining");
    }

    public void brake(){
        System.out.println("Ich bremse");
    }

    public void turboboost(){
        double fuelPercentage = fuelAmount / (double)fuelVolume * 100.0;
        if (fuelPercentage > 10){
            System.out.println("SuperBoostMode");
        } else System.out.println("Not enough fuel to go to Superboost");
    }
    public void honk (int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuut");
        }
    }

    public void getRemainingRange(){
        double remainingRange = (double) fuelAmount / fuelConsumption;
        System.out.println("The car has a remaining range of " + remainingRange + " km");
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
