package in.kgcoding.challenge80.utils;

import in.kgcoding.challenge80.geometry.Circle;
import in.kgcoding.challenge80.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,4);

        double cirArea = 2 * Math.PI * Math.pow(circle.radius, 2);
        double rectArea = rectangle.length * rectangle.breadth;

        System.out.printf("Circle area is: %f %nRectangle Area is:%f",cirArea,rectArea);
    }
}
