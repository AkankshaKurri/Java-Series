//Final Methods => To prevent method overriding.

//Method: A final method cannot be overridden by subclasses.

//Efficiency:Using final can lead to performance optimization, as the compiler can make certain assumptions about final elements.

//Immutable Objects: Helps in creating immutable objects in combination with private fields and no setter methods


package in.kgcoding.Final_Keyword;

public class FinalMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
