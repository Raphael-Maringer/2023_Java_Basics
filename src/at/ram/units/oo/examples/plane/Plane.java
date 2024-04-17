package at.ram.units.oo.examples.plane;

import java.util.ArrayList;

public class Plane {
    private String name;
    private Position position;
    private ArrayList<Passenger> passengers = new ArrayList<>();


    public Plane(String name, Position position) {
        this.name = name;
        this.position = position;
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

    public void printPosition(){
        position.tellPosition();
    }
}
