package ru.dataart.academy.java.figures;

public abstract class Figure {
    protected double area;
    protected double perimeter;

    public abstract double getPerimeter();
    public abstract double getArea();

    protected abstract void perimeterCalculation();
    protected abstract void areaCalculation();
}
