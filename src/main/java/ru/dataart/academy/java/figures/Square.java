package ru.dataart.academy.java.figures;

public final class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return super.getSide1();
    }

    public void setSide(double side) {
        super.setSides(side, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
