package in.inheritance;

public class TwoWheeler extends Vehicle {
    //Inheritance mei constructor public ya protected hona jaruri hai.
    //Kyuki is parent ka koi child banega toh
    //useh access milni chahiye.
    protected TwoWheeler(){
        setNumberOfTires(2);
    }

    public void balance(){
        System.out.printf("I am balancing on %d tires\n",numberOfTires);
    }
}
