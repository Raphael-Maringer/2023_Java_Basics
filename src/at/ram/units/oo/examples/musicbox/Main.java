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

        Record r1 = new Record(t1, 1);
        r1.addTitle(t2);
        r1.addTitle(t3);

        Record r2 = new Record(t4, 2);
        r2.addTitle(t5);
        r2.addTitle(t6);

        Magazine magazine = new Magazine();
        magazine.addRecord(r1);

        Musicbox musicbox = new Musicbox(magazine);
        musicbox.loadRecord(r1);

        System.out.println(magazine.getSumOfMusic());

        // magazine.searchRecord();

        musicbox.selectMethod();
    }
}
