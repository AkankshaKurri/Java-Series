package in.kgcoding.challenge87;

public class Eagle extends Bird{

    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am Eagle.I fly very high");
    }
}
