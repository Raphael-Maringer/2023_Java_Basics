package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;

public class Record {
    private ArrayList<Title> titles;

    public Record() {
        titles = new ArrayList<Title>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public void getSum() {
        for (Title title : titles) {
            System.out.println("Total duration: " + title.getDuration() + "s)");
        }
    }

    public void getTitle() {
        for (Title title : titles) {
            System.out.println("Title: ");
        }
    }
}
