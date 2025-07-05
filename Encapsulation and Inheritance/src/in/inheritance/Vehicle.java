//Agar object and inheritance nhi samjhe toh
//check karna do chizo ke bich mei konsa relationship hai?
// has a -> aayega toh inheritance
// is a -> aayega toh objects


//Inheritance mei
//private variable within the class hi access hoti hai
//private variable can be accessed through setter (same package hona chahiye)

//default variable bhi within the class access hogi
//default variable within the same package(Agar parent ka child dusre package mei hoga toh access nhi milega)

//To solve that problem -> if you want to give access to child present in different package
//                     and if you want to give access to child within the package
//Provide variable as protected

package in.inheritance;

public class Vehicle {
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfTires=" + numberOfTires +
                '}';
    }

    public void commute(){
        System.out.printf("I am going from place A to B using %d tires\n", numberOfTires);
    }
}
