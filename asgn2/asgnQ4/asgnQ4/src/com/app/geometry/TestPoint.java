package com.app.geometry;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of Point 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of Point 1: ");
        double y1 = scanner.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        System.out.print("Enter the x-coordinate of Point 2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of Point 2: ");
        double y2 = scanner.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Details of Point 1: " + p1.getDetails());
        System.out.println("Details of Point 2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Point 1 and Point 2 are at the same position.");
        } else {
            double distance = p1.calculateDistance(p2);
            System.out.println("Point 1 and Point 2 are at different positions.");
            System.out.println("Distance between Point 1 and Point 2: " + distance);
        }

        scanner.close();
    }
}
