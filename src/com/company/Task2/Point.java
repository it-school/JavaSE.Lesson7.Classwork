package com.company.Task2;

public class Point {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    int x, y;
    String title;

    public Point(int x, int y, String title) {
        this.x = x;
        this.y = y;
        this.title = title;
    }

    public Point() {
    }

    @Override
    public String toString() {
        return title + '('+x + ',' + y + ')';
    }
}
