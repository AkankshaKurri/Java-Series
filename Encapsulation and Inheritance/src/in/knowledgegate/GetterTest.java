package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        //If constructor is not public
        //we cannot create object in different package
        //'Car(java.lang.String, java.lang.String, double, long)' is not public in 'in.gettersetter.Car'. Cannot be accessed from outside package
        Car car = new Car("Pink", "Mercedes", 7, 700000);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
