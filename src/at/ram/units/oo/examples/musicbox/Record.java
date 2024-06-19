package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;

public class Record {
    private ArrayList<Title> titles;
    private String recordTitle;
    private int id;

    public Record() {
        this.titles = new ArrayList<Title>();
        this.recordTitle = recordTitle;
        this.id = id;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public int getSum() {
        int sumOfTitle = 0;
        for (Title title : titles) {
            sumOfTitle += title.getDuration();
            System.out.println("Total duration: " + title.getDuration() + "s");
        }
        return sumOfTitle;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public String getRecordTitle() {
        return recordTitle;
    }

    public int getId() {
        return id;
    }
}
