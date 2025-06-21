import java.util.Scanner;

//Car is a class
// class is a blueprint
public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String colour;
    int currentFuelInLitres;
    float maxSpeed;
    int noOfSeats;

    //Static Block
    //Object creation ke time
    //and constructor call hone se pehle jvm static block call karta
    //Yeh ek hi baar call hoga
    static{
        noOfCarsSold = 0;
        System.out.println("I am in Static Block");
    }

    //Normal Block
    //Yeh har object ke creation par call hoga
    {
        noOfCarsSold++;
        System.out.println("I am in Iniatialization Block");
    }


    //Parameterized Constructor
    Car(String colour){
        noOfWheels = 4;
        this.colour = colour;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSeats = 5;
    }

    //Calling Constructor using this
    Car(){
        this("Pink");
    }

    //Default Constructor
//    Car(){
//        noOfWheels = 4;
//        this.colour = "Black";
//        maxSpeed = 150;
//        currentFuelInLitres = 2;
//        noOfSeats = 5;
//    }

    public Car start(){
        if(currentFuelInLitres == 0){
            System.out.println("Car is out of fuel,cannot start");
        }else if (currentFuelInLitres < 5){
            System.out.println("Car is in reserved mode, please refuel");
        }else {
            System.out.println("brrrrrrrhhhhhhhhhhhhhhh !!!! Car is started");
            currentFuelInLitres--;
        }
        return this;
    }

    public void drive(){
        if(currentFuelInLitres != 0){
            currentFuelInLitres --;
            System.out.println("Car is driving");
        }
    }

    public void getCurrentFuelLevel(){
        System.out.println(currentFuelInLitres);
    }

    public void addFuel(int currentFuelInLitres){
        System.out.println("Adding Fuel");
        this.currentFuelInLitres += currentFuelInLitres;
        System.out.println("Fuel Added");
    }

    public void getMaxSpeed(){
        System.out.println(maxSpeed);
    }
}