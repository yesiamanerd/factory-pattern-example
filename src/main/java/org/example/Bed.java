package org.example;

class Bed extends Furniture {
    Bed(Color color, BedSize size) {
        super(color, size, null, null);
    }
    public String getType() {
        return "Bed";
    }
}
