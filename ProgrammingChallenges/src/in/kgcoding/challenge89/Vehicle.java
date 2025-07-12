//Define a base class Vehicle with a method service() and a subclass Car
//that overrides service(). In Car's service(), provide a specific implementation that
//calls super.service() as well, to show how overriding works.

package in.kgcoding.challenge89;

public class Vehicle {
    public void service(){
        System.out.println("Vehicle is getting serviced...");
    }
}


