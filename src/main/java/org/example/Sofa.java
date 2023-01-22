package org.example;

class Sofa extends Furniture {
    Sofa(Color color, SeatingSize size) {
        super(color, null, size, null);
    }
    public String getType() {
        return "Sofa";
    }
}
