package at.ram.units.oo.car;

public class Car {
    int fuelConsumption;
    public int fuelAmount;
    String brand;
    String serialNumber;
    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }
}
