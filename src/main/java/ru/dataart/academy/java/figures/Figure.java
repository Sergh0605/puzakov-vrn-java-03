package ru.dataart.academy.java.figures;

public abstract class Figure {
    protected double area;
    protected double perimeter;

    public double getPerimeter() {
        return perimeter;
    };
    public double getArea() {
        return area;
    };

    protected abstract void perimeterCalculation();
    protected abstract void areaCalculation();
}
