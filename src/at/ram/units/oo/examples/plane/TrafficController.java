package at.ram.units.oo.examples.plane;

import java.util.ArrayList;

public class TrafficController {
    private ArrayList<Plane> planes = new ArrayList<>();


    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void printAllPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane.getName());
        }
    }

    public void informPeopleOnAllPlanes(String message) {
        for (Plane plane : this.planes) {
            plane.informPassengers(message);
        }
    }

    public void printAllPositions(){
        for (Plane plane: this.planes) {
            plane.printPosition();
        }
    }
}
