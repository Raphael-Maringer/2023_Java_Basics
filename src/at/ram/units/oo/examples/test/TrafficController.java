package at.ram.units.oo.examples.test;
import at.ram.units.oo.examples.handy.PhoneFile;
import at.ram.units.oo.examples.test.Plane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TrafficController {

    private ArrayList<Plane> planes;
    //static Scanner scanner = new Scanner(System.in);
    String message;


    public TrafficController(String message) {
        this.message = message;
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public ArrayList<Plane> getAllPlanes() {
        System.out.println(this.planes);
        return this.planes;
    }

    public void printAllPlanes() {
        ArrayList<Plane> planes = getAllPlanes();
        for (Plane plane : planes) {
            System.out.println(plane.getName());
        }
    }


    /* public String makeMessage() {
        System.out.println("Wie lautet die Nachricht?");
        String message = scanner.nextLine();
        System.out.println(message);
        return message;
    }

    public void informAllPlanes() {
        ArrayList<Plane> planes = getAllPlanes();
        for (Plane plane : planes) {
            makeMessage();
        }
    } */

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plane> planes) {
        this.planes = planes;
    }

    public static String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
