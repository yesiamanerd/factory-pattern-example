package org.example;

public class FurnitureFactory {
    public static Furniture createChair(Color color, SeatingSize size) {
        if (isValidColor(color)) {
            isValidSeatingSize(size);
        }
        return new Chair(color, size);
    }

    public static Furniture createSofa(Color color, SeatingSize size) {
        if (isValidColor(color)) {
            isValidSeatingSize(size);
        }
        return new Sofa(color, size);
    }

    public static Furniture createTable(Color color, Shape shape) {
        if (isValidColor(color)) {
            isValidShape(shape);
        }
        return new Table(color, shape);
    }

    public static Furniture createBed(Color color, BedSize size) {
        if (isValidColor(color)) {
            isValidBedSize(size);
        }
        return new Bed(color, size);
    }

    private static boolean isValidColor(Color color) {
        if(color == null) {
            throw new IllegalArgumentException("Invalid color argument");
        } else {
            return true;
        }
    }

    private static void isValidSeatingSize(SeatingSize size) {
        if(size == null) {
            throw new IllegalArgumentException("Invalid seating size argument");
        }
    }

    private static void isValidBedSize(BedSize size) {
        if(size == null) {
            throw new IllegalArgumentException("Invalid bed size argument");
        }
    }

    private static void isValidShape(Shape shape) {
        if(shape == null) {
            throw new IllegalArgumentException("Invalid shape argument");
        }
    }

}



