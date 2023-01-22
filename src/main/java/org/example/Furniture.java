package org.example;

public abstract class Furniture {
    protected Color color;
    protected BedSize bedSize;
    protected SeatingSize seatingSize;
    protected Shape shape;

    // Bed constructor
    public Furniture(Color color, BedSize bedSize, SeatingSize seatingSize, Shape shape) {
        this.color = color;
        this.bedSize = bedSize;
        this.seatingSize = seatingSize;
        this.shape = shape;
    }

    public abstract String getType();
}