package in.kgcoding.super_keyword;
class Car extends Vehicle {
    Car(){
        super();
    }

    Car(int noOfTires){
        super(noOfTires); //Calling Vehicle Constructor
    }
    public int noOfDoors(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTires());   //Calling Vehicle class method
        System.out.println("Car is starting");
    }
}
