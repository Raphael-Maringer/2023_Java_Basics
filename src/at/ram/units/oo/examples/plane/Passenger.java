package at.ram.units.oo.examples.plane;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void inform(String message) {
        System.out.println("My name is " + firstName + " " + lastName + " and the message is: '" + message +"'");
    }
}
