package in.kgcoding;

public class AccessModifiersTest {
    public static void main(String[] args) {
        PublicCarClass car = new PublicCarClass();
        car.color = "Blue";
        car.model = "Swift";

        //costOfPurchase "Private" hai
        //car.costOfPurchase = 10000; //Error: 'costOfPurchase' has private access in 'in.kgcoding.PublicCarClass'

        //costOfPurchase "Default" hai
        car.costOfPurchase = 10000;

        System.out.printf(car.toString());

        PublicCarClass newCar = new PublicCarClass("Pink", "Mercedes",10,100000);
        System.out.printf(newCar.toString());

        DefaultClass def = new DefaultClass();
    }
}
