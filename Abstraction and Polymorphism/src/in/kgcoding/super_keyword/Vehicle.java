package in.kgcoding.super_keyword;
public abstract class Vehicle {
    private int noOfTires;

    Vehicle(){
        this.noOfTires = 0;
    }

    Vehicle(int noOfTires){
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void start(){
        System.out.println("Vehicle is Starting");
    }

}
