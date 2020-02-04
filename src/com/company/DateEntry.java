package com.company;

import java.util.ArrayList;

public class DateEntry {
    static ArrayList<DateEntry> listOfEntries = new ArrayList<>();
    String dateName;
    double low;
    double high;
    double volume;
    double open;
    double close;

    public DateEntry(String dateName, double low, double high, double volume, double open, double close) {
        this.dateName = dateName;
        this.low = low;
        this.high = high;
        this.volume = volume;
        this.open = open;
        this.close = close;
        listOfEntries.add(this);
        System.out.println("Added to master list");
    }

    public static void seeEntries() {
        for(int i = 0; i < listOfEntries.size(); i++) {
            System.out.println(listOfEntries.get(i).dateName);
            System.out.println("Low: " + listOfEntries.get(i).close);
            System.out.println();
        }
    }
}
