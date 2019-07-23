package com.company;

import com.company.Task1.Address;
import com.company.Task2.Figure;
import com.company.Task2.Point;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Address address1  = new Address("65000", "Ukraine", "Odesskaya", "Odessa", "Shevchenko", 1, "A", 1);
        System.out.println(address1);

        //        address1.setCity("london");
//        System.out.println(address1.getCity());
//        System.out.println(address1.CapitalizeFirstLetter(address1.getCity()));
/*
        do {
            System.out.println("Input appartment number (>0): ");
        }while (!address1.setAppartmentNumber(scanner.nextInt()));
    */

        Point x = new Point(0, 3, "X");
        Point y = new Point(4, 0, "Y");
        Point z = new Point(0, 0, "Z");

        Figure figure = new Figure(x,y,z);
        System.out.println(figure);

        Figure figure2 = new Figure(x,y,z, new Point(0,0,"A"), new Point(100, 3, "B"));
        System.out.println(figure2);

        System.out.println("Side:" + figure.GetLengthSide(x,y));
        System.out.println("Side:" + Figure.GetLengthSide(new Point(0,3,"Q"), new Point(4,0,"W")));

        System.out.println("Perimeter: " + figure.GetPerimeter());
    }
}
