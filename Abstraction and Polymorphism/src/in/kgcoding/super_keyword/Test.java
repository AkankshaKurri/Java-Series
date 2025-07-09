//1.Super can be used to refer immediate parent class instamce variable.
//2. Super can be used to invoke immediate parent class method.
//3.Super() can be used to invoke immediate parent class constructor.


package in.kgcoding.super_keyword;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getNoOfTires());
        System.out.println(car.noOfDoors());
        car.start();

        Car car1 = new Car(4);
        System.out.println(car1.getNoOfTires());
        System.out.println(car.noOfDoors());
        car1.start();

        Plane plane = new Plane();
        plane.start();
    }
}
