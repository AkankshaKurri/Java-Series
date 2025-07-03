//Private variables of a class can be accessed
//-> inside the class
// -> class ke constructor mei
// -> class ke method mei

//Default variables of a class can be accesses
// -> inside its own package
// -> cannot be accessed outside package

//Public class can be accessed anywhere
//default class can be accessed in own package
//default class cannot be accessed outside package


package in.kgcoding;

public class PublicCarClass {
      public String color;
      public String model;
      private double fuelLevel;


//      private long costOfPurchase;   //Private

      long costOfPurchase;             //Default

      public PublicCarClass(){

      }

      public PublicCarClass(String color, String model, double fuelLevel, long costOfPurchase) {
            this.color = color;
            this.model = model;
            this.fuelLevel = fuelLevel;
            this.costOfPurchase = costOfPurchase;
      }

      @Override
      public String toString() {
            return "PublicCarClass{" +
                    "color='" + color + '\'' +
                    ", model='" + model + '\'' +
                    ", fuelLevel=" + fuelLevel +
                    ", costOfPurchase=" + costOfPurchase +
                    '}';
      }
}
