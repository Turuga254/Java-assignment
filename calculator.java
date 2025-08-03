package com.geometry.utils;
import java.util.Scanner;
public class Calculator {
    private double base;
    private double height;
    private double area;

    //method to check leap year
    public void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println("The year you entered is a leap year");
        } else {
            System.out.println("The year you entered is not a leap year");
        }
    }

        // Method to get triangle dimensions
        public void getTriangleDimensions() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the base of the triangle: ");
            base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            height = scanner.nextDouble();
        }
        // Method to calculate triangle area
        public void calculateTriangleArea() {
            area = 0.5 * base * height;
        }
        // Method to display triangle area
        public void displayTriangleArea() {
            System.out.printf("The area of the triangle is: %.2f square units%n", area);
        }

        public static void main(String[] args) {
            Calculator calc = new Calculator();

            // Testing leap year
            calc.checkLeapYear();

            // Calculating triangle area
            calc.getTriangleDimensions();
            calc.calculateTriangleArea();
            calc.displayTriangleArea();
        }
    }
