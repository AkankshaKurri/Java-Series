public class Driver {

    static int minAgeForDriving = 18;
    int age;
    String name;
    String dateOfLicense;

    public boolean isAllowedForDriving(){
        return this.age >= minAgeForDriving;//static members(minAgeForDriving) ko nonstatic method mei access kar sakte hai
    }

    public static void main(String[] args) {
        //Declaring Objects
        //reference => "car"
        // new instantiates the new object of a class
        //"car" -> object ka address store karta hai

        //Objects are real values
      Car car = new Car();

        //Accessing properties using . Operator

      car.addFuel(10);
      car.start();
      car.drive();
      car.getCurrentFuelLevel();
      car.drive();
      car.getMaxSpeed();

      Car mySwift = new Car("Pink");
      System.out.println(mySwift.colour);
      mySwift.addFuel(6);
      Car startedCar = mySwift.start();
      startedCar.drive();


      Car thar = new Car();
      thar.start().drive(); //chaining

        Driver myDriver = new Driver();
        //Direct class (Driver.name and Driver.dateOfLicense) ke through access nhi kar sakte hai
        myDriver.name = "ABC"; //object ke through nonstatic members access kar sakte hai
        myDriver.dateOfLicense = "DD/MM/YYYY"; //object ke through nonstatic members access kar sakte hai

        System.out.println(minAgeForDriving); //minAgeForDriving bhi static hai
                                              //Aur main method bhi static hai
                                              //toh static members directly access kar sakte hai

         myDriver.age = 5;////object ke through nonstatic members access kar sakte hai

    }
}
