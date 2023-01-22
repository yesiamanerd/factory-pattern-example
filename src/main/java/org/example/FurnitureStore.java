package org.example;

public class FurnitureStore {
    public static void main(String[] args) {
        Furniture chair1 = FurnitureFactory.createChair(Color.RED, SeatingSize.LARGE);
        Furniture chair2 = FurnitureFactory.createChair(Color.BLUE, SeatingSize.SMALL);
        Furniture table1 = FurnitureFactory.createTable(Color.BROWN, Shape.RECTANGLE);
        Furniture table2 = FurnitureFactory.createTable(Color.BLACK, Shape.CIRCLE);
        Furniture sofa1 = FurnitureFactory.createSofa(Color.WHITE, SeatingSize.MEDIUM);
        Furniture bed1 = FurnitureFactory.createBed(Color.BEIGE, BedSize.KING);

        System.out.println("Created chair1: " + chair1.getType());
        System.out.println("Created chair2: " + chair2.getType());
        System.out.println("Created table1: " + table1.getType());
        System.out.println("Created table2: " + table2.getType());
        System.out.println("Created sofa1: " + sofa1.getType());
        System.out.println("Created bed1: " + bed1.getType());
    }
}
