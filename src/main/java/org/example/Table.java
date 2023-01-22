package org.example;

class Table extends Furniture {
    Table(Color color, Shape shape) {
        super(color, null, null, shape);
    }
    public String getType() {
        return "Table";
    }
}
