//Upcasting:
//-> Converts subclass to superclass reference.
//-> Automatic and safe.
//-> Access only to superclass methods.

//Downcasting
//-> Converts superclass to subclass reference.
//-> Manual and risky, needs instanceOf check
//-> Access to subclass-specific methods.

//Usage:
//-> Upcasting for generalization in methods.
//-> Downcasting for specific subclass behaviors.

package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        // Creating instances of each class
        Vehicle vehicle = new Vehicle();   // vehicle -> reference of Vehicle, object of Vehicle
        Car car = new Car();              // car -> reference of Car, object of Car
        Plane plane = new Plane();        // plane -> reference of Plane, object of Plane

        //castTest(vehicle);

        // Only call castTest with a Car object
        // Passing Car object to a method that expects Vehicle reference
        castTest(car);

       // castTest(plane);


        // ✅ Upcasting Examples:
        // Storing child class objects in a parent class reference
        //Object ref = new Vehicle();
        //Object ref2 = new Car();
        //Object ref3 = new Plane();

        /*
         * Downcasting Example (Invalid)
         * Trying to cast a Vehicle object to a Car reference.
         * This compiles, but throws ClassCastException at runtime
         * because Vehicle is not actually a Car object.
         */
        //Car veh = (Car) new Vehicle(); // Vehicle is not a Car
    }

    /**
     * Method accepts a Vehicle reference, but we are passing a Car object
     * So we are performing Downcasting inside this method (from Vehicle to Car)
     */
    private static void castTest(Vehicle veh){
        veh.start(); // Calls Car's start() if object is Car — Polymorphism

        //Downcasting: Converting parent reference to child (Vehicle to Car)
        // Safe only if 'veh' is actually pointing to a Car object
        System.out.println(((Car) veh).noOfDoors());  // Casting veh to Car to call child-specific method

        // Alternative way: explicitly store in a Car reference
        Car cVehicle = (Car) veh; // Downcasting
        cVehicle.start();        // Again, calls Car's start() method
        System.out.println(cVehicle.noOfDoors());     //calls Car-specific method
    }
}
