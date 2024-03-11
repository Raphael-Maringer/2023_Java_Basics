package at.ram.units.oo.examples.handy;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    String color;
    Camera camera;

    SDCard sdCard;
    SIMCard simCard;

    public Phone(String color, Camera camera, SDCard sdCard, SIMCard simCard) {
        this.color = color;
        this.camera = camera;

        this.sdCard = sdCard;
        this.simCard = simCard;
    }

    public void takePicture() {
        PhoneFile pic = camera.makePicture();
        if (pic.getSizeInMB() < sdCard.getFreeSpace()) {
            this.sdCard.saveFile(pic);
        } else {
            System.out.println("Nicht genügend Speicherplatz übrig!");
            return;
        }
    }

    public void makeCall() {
        simCard.doCall(simCard.getNumber());
    }

    public void getFreeSpace() {
        System.out.println(sdCard.getFreeSpace() + "MB");
    }

    public void printAllFiles() {
        ArrayList<PhoneFile> files = this.sdCard.getAllFiles();
        for (PhoneFile file : files) {
            System.out.println(file.getInfo());
        }
    }
}
