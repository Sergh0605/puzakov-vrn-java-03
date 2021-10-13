package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;
import ru.dataart.academy.java.figures.Square;

public class Main{
    public static void main(String[] args) {
        Figure[] figures = getFiguresArray();
        System.out.println("Sum of areas " + Calculator.getSumOfAreas(figures));
    }

    public static Figure[] getFiguresArray() {
        Figure[] figures = new Figure[12];
        figures[0] = new Circle(15);
        figures[1] = new Circle(0);
        figures[2] = new Circle(13);
        figures[3] = new Circle(-2);
        figures[4] = new Circle(23);
        figures[5] = new Square(15);
        figures[6] = new Rectangle(12, 0);
        figures[7] = new Rectangle(12, 11);
        figures[8] = new Rectangle(16, 46);
        figures[9] = new Rectangle(18, 1);
        figures[10] = new Rectangle(10, 20);
        figures[11] = new Rectangle(12, 2);
        return figures;
    }
}