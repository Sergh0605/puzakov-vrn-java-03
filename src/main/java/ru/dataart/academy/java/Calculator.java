package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    static public double getSumOfAreas(Figure[] figures) {
        double sumOfAreas = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) sumOfAreas += figures[i].getArea();
        }
        return sumOfAreas;
    }
}
