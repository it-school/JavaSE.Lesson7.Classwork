package com.company.Task2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Figure {
    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    Point [] points;

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = "";
        for (Point p : points)
            this.title += p.title;
        this.title = this.title.toUpperCase();
    }

    String title;

    public Figure()
    {
    }


    public Figure(Point p1, Point p2, Point p3)
    {
        points = new Point[3];

        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        this.setTitle();
    }

    public Figure(Point p1, Point p2, Point p3, Point p4)
    {
        points = new Point[4];

        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;

        this.setTitle();

    }

    public Figure(Point p1, Point p2, Point p3, Point p4, Point p5)
    {
        points = new Point[5];

        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
        points[4] = p5;

        this.setTitle();

    }

    @Override
    public String toString() {
        return title + " (" + Arrays.toString(points) + ")";
    }

    public static double GetLengthSide(Point p1, Point p2)
    {
       return Math.sqrt(Math.pow((p1.x-p2.x),2) + Math.pow((p1.y-p2.y),2));
    }

    public double GetPerimeter()
    {
        double perimeter = 0;

        for (int i = 0; i < points.length; i++) {
            perimeter += GetLengthSide(points[i], points[(i+1)%points.length]);
        }

        return perimeter;
    }
}
