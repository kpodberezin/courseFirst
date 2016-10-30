package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        //System.out.println("Hello, word!");

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 2);
        System.out.println("Расстояние от точки " + p1.toString() + " до точки " + p2.toString() + " = " + distance(p1, p2));
        System.out.println("Расстояние от точки " + p1.toString() + " до точки " + p2.toString() + " = " + p1.distanceTo(p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}