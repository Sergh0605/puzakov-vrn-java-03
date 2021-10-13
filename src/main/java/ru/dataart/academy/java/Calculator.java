package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    static public double getSumOfAreas(Figure[] figures) {
        double sumOfAreas = 0;
        for (Figure figure : figures) {
            if (figure != null) sumOfAreas += figure.getArea();
        }
        return sumOfAreas;
    }
}
