package at.ram.units.oo.examples.handy;

public class Main {
    public static void main(String[] args) {
        /*
        PhoneFile f1 = new PhoneFile("png", 3, "image1");
        PhoneFile f2 = new PhoneFile("jpg", 6, "image2");
        PhoneFile f3 = new PhoneFile("png", 4, "image3"); */

        SDCard sdCard = new SDCard(30);
        Camera c1 = new Camera(75);
        SIMCard simCard = new SIMCard(321, "+43 123 789 5463");

        Phone phone = new Phone("res", c1, sdCard,simCard);
        phone.takePicture();
        phone.takePicture();
        phone.printAllFiles();
        phone.makeCall();
        phone.getFreeSpace();

    }
}
