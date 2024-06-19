package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;

public class Musicbox {
    private Magazine magazine;
    private ArrayList<Record> playlist;

    public Musicbox(Magazine magazine) {
        this.magazine = new Magazine();
        playlist = new ArrayList<Record>();
    }

    public void loadRecord(Record record){
        playlist.add(record);
        System.out.println(record.getRecordTitle());
    }

    public void play(){
        for (Record record : playlist) {
            System.out.println("Current track: " + record.getRecordTitle());
            for (Title title : record.getTitles()) {
                System.out.println("Title: " + title.getTitle() + " Artist: " + title.getArtist() + " Duration: " + title.getDuration());
            }
        }
    }
}
