package at.ram.units.oo.examples.plane;

public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Max", "Mustermann");
        Passenger p2 = new Passenger("Martha", "Musterfrau");
        Plane pl1 = new Plane("Boeing777", new Position(753, 485));
        Plane pl2 = new Plane("Airbus333", new Position(85, 149));


        pl1.addPassengers(p1);
        pl2.addPassengers(p2);

        pl1.informPassengers("Hallo");

        pl1.printPosition();

        TrafficController trafficController = new TrafficController();

        trafficController.addPlane(pl1);
        trafficController.addPlane(pl2);

        trafficController.printAllPlanes();

        trafficController.informPeopleOnAllPlanes("Hallihallohallöchen");

        trafficController.printAllPlanes();
        trafficController.printAllPositions();
    }
}
