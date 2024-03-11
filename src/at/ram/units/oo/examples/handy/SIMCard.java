package at.ram.units.oo.examples.handy;

public class SIMCard {
    private int id;
    private String number;

    public SIMCard(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String number) {
        System.out.println("I am calling " + number);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

