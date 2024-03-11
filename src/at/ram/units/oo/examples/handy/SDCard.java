package at.ram.units.oo.examples.handy;

import java.util.ArrayList;

public class SDCard {
    private double capacity;
    private ArrayList<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        files = new ArrayList<>();
    }

    public void saveFile(PhoneFile file) {
        files.add(file);
    }

    public ArrayList<PhoneFile> getAllFiles() {
        return this.files;
    }

    public double getFreeSpace() {
        double usage = 0;
        for (PhoneFile file : files) {
            usage += file.getSizeInMB();
        }
        return capacity - usage;
    }

}
