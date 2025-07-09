//Java does not allow multiple inheritances.(means a class cannot have multiple parents)
//But java allow multiple interfaces.

//Interfaces primarily declare abstract methods for implementation by classes.
//A class can implement multiple interfaces, allowing for more flexible designs.
//Interfaces can have default methods with implementation and static methods.
//Interface methods are inherently public and abstract, except for default and static methods.

package in.kgcoding.abstraction_and_interfaces;

public interface Transport {

      //By default, method is public and abstract
      //method must be public in interfaces
      void getSetGo();
}
