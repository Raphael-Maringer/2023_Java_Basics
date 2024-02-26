package at.ram.units.oo.examples.inheritance;

public class Truck extends Car {
    private String trailer;
    public Truck(Engine engine, Tank tank, String brand, String serialNumber, String color, int honkAmount, String Trailer) {
        super(engine, tank, brand, serialNumber, color, honkAmount);

        this.trailer = Trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        System.out.println("I am driving the truck - consumption is high");
        // super.drive();
    }

    @Override
    public void brake() {
        System.out.println("I am breaking ..... truck");
        // super.brake();
    }
}
