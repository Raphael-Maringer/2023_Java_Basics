package at.ram.units.oo.examples.musicbox;

import java.util.ArrayList;

public class Magazine {
    private ArrayList<Record> records;

    public Magazine() {
        records = new ArrayList<Record>();
    }

    public void removeRecord(Record record) {
        records.remove(record);
    }

    public void getSumOfMusic() {
        for (Record record : records) {
            record.getSum();
        }
    }

    public void searchRecord() {
    }
}
