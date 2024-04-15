package at.ram.units.oo.examples.test;

import java.util.ArrayList;

public class Plane {
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



 /*   public void getPosition() {
        System.out.println("Meine Position ist: " + Position.getLongitude() + " longitude und " + Position.getLatitude() + " Latitude");
    } */



    public void informPassengers(String message) {
        String messages = TrafficController.getMessage();
        for (Plane plane : planes) {
            System.out.println(plane.getName());
        }
    }


}
