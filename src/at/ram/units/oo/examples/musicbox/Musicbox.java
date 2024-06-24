package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;
import java.util.Scanner;

public class Musicbox {
    private Magazine magazine;
    private ArrayList<Record> playlist;

    public Musicbox(Magazine magazine) {
        this.magazine = new Magazine();
        playlist = new ArrayList<Record>();
    }

    public void loadRecord(Record record){
        playlist.add(record);
        System.out.println("Currently playing " + record.getRecordName() + " by " + record.getArtistName());
    }

    public void play(){
        for (Record record : playlist) {
            System.out.println("Current track: " + record.getRecordName());
            for (Title title : record.getTitles()) {
                System.out.println("Title: " + title.getTitle() + " ,Artist: " + title.getArtist() + " Duration: " + title.getDuration());
            }
        }
    }

    public void removeRecord(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Record> records = magazine.getRecords();
        System.out.println("Which record do you want to remove? Enter: ");
        String removingRecord = scanner.nextLine();
        for (Record record : records) {
            if (record.getRecordName().contains(removingRecord)) {
                records.remove(record);
                System.out.println("Record removed");
            }
        }
    }

    public void selectMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a method: ");
        System.out.println("Type 1 to load a record");
        System.out.println("Type 2 to play a title");
        System.out.println("Type 3 to remove a record");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Which record do you want to listen to?");
                Record wantedRecord = magazine.searchRecordByID();
                if (wantedRecord == null) {
                    System.out.println("No record was found!");

                } else {
                    loadRecord(wantedRecord);
                }
                break;
            case 2:
                play();
                break;
            case 3:
                removeRecord();
                break;
        }
    }
}
