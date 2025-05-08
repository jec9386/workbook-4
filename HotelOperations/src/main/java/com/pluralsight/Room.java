package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return (!this.occupied) &&(!this.dirty);
    }

    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }

    public void checkOut(){
       // instructor didnt put this here but I think this needs to be here. cleanRoom();
        this.occupied = false;
    }

    public void cleanRoom(){
        this.dirty = false;
    }
}