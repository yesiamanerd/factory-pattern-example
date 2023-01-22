package org.example;

class Chair extends Furniture {
    Chair(Color color, SeatingSize size) {
        super(color, null, size, null);
    }
    public String getType() {
        return "Chair";
    }
}
