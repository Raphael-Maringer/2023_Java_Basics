package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;
import java.util.Scanner;

public class Magazine {
    private ArrayList<Record> records;

    public Magazine() {
        records = new ArrayList<Record>();
    }

    public void addRecord(Record record) {
        if (records.size() < 50) {
            records.add(record);
        } else {
            System.out.println("No space remaining!");
        }
    }

    public void removeRecord(Record record) {
        records.remove(record);
    }

    public int getSumOfMusic() {
        int sum = 0;
        for (Record record : records) {
            sum += record.getSum();
        }
        return sum;
    }

    /* public Record searchRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which record are you looking for? Enter the title: ");
        String searchedRecordName = scanner.nextLine();
        for (Record record : records) {
            if (record.getRecordName().contains(searchedRecordName)) {
                System.out.println("Record was found: " + record.getRecordName());
                return record;
            } else {
                System.out.println("The Record was not found!");
            }
        }
        return null;
    }
    !not working!
    */

    public void showAllRecords() {
        for (Record record : records) {
            System.out.println("Record: " + record.getRecordName() + " by " + record.getArtistName() + "ID: " + record.getId());
        }
    }

    public Record searchRecordByID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see all records? 1 for yes, 2 for no!");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                showAllRecords();
            case 2:
                System.out.println("Enter the ID:");
                int searchingRecordID = scanner.nextInt();
                for (Record record : records) {
                    if (record.getId() == searchingRecordID) {
                        System.out.println("Record was found: " + record.getRecordName());
                        return record;
                    }
                    break;
                }
        }
        return null;
    }




public ArrayList<Record> getRecords(){
        return records;
        }
        }
