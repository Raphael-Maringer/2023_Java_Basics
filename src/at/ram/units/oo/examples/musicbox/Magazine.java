package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;

public class Magazine {
    private ArrayList<Record> records;

    public Magazine() {
        records = new ArrayList<Record>();
    }

    public void addRecord(Record record) {
        if (records.size() < 10) {
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

    public void searchRecord(String title) {
    }

    public ArrayList<Record> getRecords() {
        return records;
    }
}
