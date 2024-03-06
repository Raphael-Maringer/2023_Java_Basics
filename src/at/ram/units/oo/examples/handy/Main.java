package at.ram.units.oo.examples.handy;

public class Main {
    public static void main(String[] args) {
        PhoneFile f1 = new PhoneFile("png", 3, "image1");
        PhoneFile f2 = new PhoneFile("jpg", 6, "image2");
        PhoneFile f3 = new PhoneFile("png", 4, "image3");



        SDCard SDCard = new SDCard(30);
        Camera c1 = new Camera(75);
        PhoneFile f4 = c1.makePicture();
        PhoneFile f5 = c1.makePicture();


        SDCard.saveFile(f1);
        SDCard.saveFile(f4);
        SDCard.saveFile(f5);

        SDCard.getAllFiles();
        System.out.println(SDCard.getFreeSpace());

    }
}
