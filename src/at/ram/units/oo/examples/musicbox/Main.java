package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Title t1 = new Title("Title 1", "Artist 1", 180);
        Title t2 = new Title("Title 2", "Artist 2", 200);
        Title t3 = new Title("Title 3", "Artist 3", 220);
        Title t4 = new Title("Title 4", "Artist 4", 180);
        Title t5 = new Title("Title 5", "Artist 5", 200);
        Title t6 = new Title("Title 6", "Artist 6", 220);

        Record record1 = new Record();
        record1.addTitle(t1);
        record1.addTitle(t2);
        record1.addTitle(t3);

        Record record2 = new Record();
        record1.addTitle(t4);
        record1.addTitle(t5);
        record1.addTitle(t6);

        Magazine magazine = new Magazine();
        magazine.addRecord(record1);

        Musicbox musicbox = new Musicbox(magazine);
        musicbox.loadRecord(record1);

        System.out.println(magazine.getSumOfMusic());

    }
}
