package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfBasicRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfBasicRooms ) {
        this.name = name;
        this. numberOfSuites = numberOfSuites;
        this. numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfBasicRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableBasicRooms() {
        return numberOfBasicRooms - bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite){
            if (numberOfRooms <= getAvailableSuites()) {
                bookedSuites += numberOfRooms;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (numberOfRooms <= getNumberOfBasicRooms()){
                bookedBasicRooms += numberOfRooms;
                return true;
            }
            else{
                return false;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfBasicRooms() {
        return numberOfBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", numberOfSuites=" + numberOfSuites +
                ", numberOfBasicRooms=" + numberOfBasicRooms +
                ", bookedSuites=" + bookedSuites +
                ", bookedBasicRooms=" + bookedBasicRooms +
                ", getAvailableSuites()=" + getAvailableSuites() +
                ", getAvailableBasicRooms()=" + getAvailableBasicRooms() +
                '}';
    }
}

