package in.kgcoding.challenge86;

public class Circle extends Shape{

    private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return  Math.PI * Math.pow(radius,2);
    }
}
