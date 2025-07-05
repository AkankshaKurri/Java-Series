//Har class -> "Object" class ka child hota hai.
//Isliye by default toString(),equals(),hashCode(),getClass(),etc aate hai har ek class ke saath

//Inheritance mei parent class se child class ko pass ho jati hai "object" class.

package in.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        TwoWheeler twowheeler = new TwoWheeler();
        twowheeler.commute();
        twowheeler.balance();

        MotorCycle motorcycle = new MotorCycle();
        motorcycle.commute();
        motorcycle.balance();
        motorcycle.start();
    }
}
