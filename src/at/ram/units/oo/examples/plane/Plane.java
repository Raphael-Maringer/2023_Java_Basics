package at.ram.units.oo.examples.plane;

import java.util.ArrayList;

public class Plane {
    private String name;
    private ArrayList<Passenger> passengers;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void informPassengers(String message) {
        for (Passenger passenger : this.passengers) {
            passenger.inform(message);
        }
    }
}
