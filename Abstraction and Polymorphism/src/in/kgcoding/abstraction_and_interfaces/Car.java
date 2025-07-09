package in.kgcoding.abstraction_and_interfaces;

public class Car extends Vehicle{
    private int noOfDoors;

    //By default, yeh constructor parent ka default constructor call karta hai
    //But parent ka default constructor nhi hai
    //isliye hame using "super keyword" parent ka constructor call karna hoga and pass arguments.
    //Constructor chaining:Har constructor ko apne parent ka constructor call karna padta hai
    public Car(){
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("brrrrrrrrrrrhhhhhh brhhhhhhhhhhhhh");
    }

}
