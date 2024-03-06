package at.ram.units.oo.examples.handy;

public class Main {
    public static void main(String[] args) {
        PhoneFile f1 = new PhoneFile("png", 3, "image1");
        PhoneFile f2 = new PhoneFile("jpg", 6, "image2");
        PhoneFile f3 = new PhoneFile("png", 4, "image3");

        SDCard SDCard = new SDCard(30);

        SDCard.saveFile(f1);
        SDCard.getAllFiles();
        System.out.println(SDCard.getFreeSpace());

    }
}
