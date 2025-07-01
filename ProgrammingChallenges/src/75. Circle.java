//Calculate the area and Circumference of a circle
//for a given radius using Math.PI

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        area(radius);
        circumference(radius);
    }

    public static void area(int r) {
        double area = Math.PI * r * r;
        System.out.println("Area is:" + area);
    }

    public static void circumference(int r) {
        double circumference = 2 * Math.PI * r;
        System.out.println("Circumference is:"+ circumference);
    }
}


//This is Sir code

//import java.util.Scanner;
//
//class Circle {
//    double radiusInMm;
//
//    Circle(double radiusInMm) {
//        this.radiusInMm = radiusInMm;
//    }
//
//    double getCircumference() {
//        return 2 * radiusInMm * Math.PI;
//    }
//
//    double getArea() {
//        return Math.PI * Math.pow(radiusInMm, 2);
//    }
//
//    @Override
//    public String toString() {
//        return "Circle Props: Radius in mm: " + radiusInMm
//                + " , Circumference in mm: " + getCircumference()
//                + ", Area in mm2: " + getArea();
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to the world of Circle\n");
//        System.out.print("Please enter your radius: ");
//        double radius = input.nextDouble();
//        Circle circle = new Circle(radius);
//        System.out.println(circle);
//    }
//}








