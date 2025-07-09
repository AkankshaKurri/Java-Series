package in.kgcoding.challenge86;

public class Test {
    public static void main(String[] args) {
        Circle circle =new Circle(5);
        System.out.println("Circle Area is:"+ circle.calculateArea());

        Square square = new Square(5);
        System.out.println("Square Area is:" + square.calculateArea());
    }
}
