//Abstract class:
//Agar aap chahte ho ke aap kisi bhi class ka object na bane toh
// us class ko abstract bana sakte ho

//Abstract method:
//Agar aap chahte ho koi bhi method ka implementation aap ka child class kare
//toh us method ko abstract declare karna padega
//aur class ko bhi abstract declare karna padega

//Abstract Class: Used to declare non-instantiable abstract classes that serve as base class.
//Abstract Method: Defines methods without implementations, requiring subclasses to provide specific functionality.
//Mandatory Implementation:Subclasses must implement all abstract methods of an abstract class.
//Design Flexibility:Allows for flexible class design by defining a contract fer subclasses.


package in.kgcoding.abstraction_and_interfaces;

public abstract class Vehicle implements Transport{
    private int noOfTires;

//    Inside abstract class -> method can be public or protected
    public abstract void makeStartSound();

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to Place...");
    }

    public void commute(){
        System.out.println("Going.........");
    }

}
