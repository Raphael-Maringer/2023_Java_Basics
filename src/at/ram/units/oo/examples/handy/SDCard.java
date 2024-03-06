package at.ram.units.oo.examples.handy;

import java.util.ArrayList;

public class SDCard {
    private int capacity;
    private ArrayList<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        files = new ArrayList<>();
    }

    public void saveFile(PhoneFile file) {
        files.add(file);
    }

    public void getAllFiles() {
        for (PhoneFile file : files) {
            System.out.println(file.getInfo());
        }
    }

    public int getFreeSpace() {
        int usage = 0;
        for (PhoneFile file : files) {
            usage += file.getSizeInMB();
        }
        return capacity - usage;
    }

}
