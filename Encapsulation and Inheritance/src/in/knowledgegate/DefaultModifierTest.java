package in.knowledgegate;

import in.kgcoding.PublicCarClass;

public class DefaultModifierTest {
    public static void main(String[] args) {
        PublicCarClass Car = new PublicCarClass();

        //costOfPurchase "default" hai
        //Car.costOfPurchase = 760000; //'costOfPurchase' is not public in 'in.kgcoding.PublicCarClass'. Cannot be accessed from outside package
    }
}
