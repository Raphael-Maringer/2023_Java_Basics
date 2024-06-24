package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;

public class Record {
    private ArrayList<Title> titles;
    private String recordName;
    private int id;

    public Record(Title title, int id) {
        this.titles = new ArrayList<Title>();
        this.recordName = title.getTitle();
        titles.add(title);
        this.id = title.getId();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public int getSum() {
        int sumOfTitle = 0;
        for (Title title : titles) {
            sumOfTitle += title.getDuration();
            // System.out.println("Duration: " + title.getDuration() + "s");
        }
        return sumOfTitle;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public String getRecordName() {
        return recordName;
    }

    public int getId() {
        return id;
    }

    public String getArtistName() {
        return titles.get(0).getArtist();
    }
}
