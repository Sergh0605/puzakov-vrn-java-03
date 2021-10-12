package ru.dataart.academy.java.figures;

import java.util.Objects;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        setSides(side1, side2);
    }

    public double getSide1() {
        return side1;
    }

    public void setSides(double side1, double side2) {
        if (side1 > 0 && side2 > 0) {
            this.side1 = side1;
            this.side2 = side2;
        } else {
            this.side1 = 0;
            this.side2 = 0;
        }
        perimeterCalculation();
        areaCalculation();
    }

    public double getSide2() {
        return side2;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    protected void perimeterCalculation() {
        perimeter = side1 * 2 + side2 * 2;
    }

    @Override
    protected void areaCalculation() {
        area = side1 * side2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(rectangle.side1, side1) == 0 && Double.compare(rectangle.side2, side2) == 0) ||
                (Double.compare(rectangle.side1, side2) == 0 && Double.compare(rectangle.side2, side1) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
