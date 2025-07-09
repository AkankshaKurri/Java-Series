//Final Classes => To prevent inheritance.

//Class: A final class cannot be subclasses, securing the class from being extended.

//Efficiency:Using final can lead to performance optimization, as the compiler can make certain assumptions about final elements.

//Immutable Objects: Helps in creating immutable objects in combination with private fields and no setter methods

package in.kgcoding.Final_Keyword;

public class FinalClassExample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
    }
}
