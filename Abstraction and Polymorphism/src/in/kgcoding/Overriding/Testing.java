//Method/Constructor Overriding

//1. Method overriding occurs when a subclass provides a specific implementation for a method already defined in its superclass.
//2. Run - Time Polymorphism: Overriding is a basis for runtime polymorphism, where the method call is determined by the object's type at runtime.
//3. Superclass Reference: An overridden method can be called through a superclass reference holding a subclass object.

//4. Same Signature: Overridden methods must have the same name, return type, and parameters as the method in the parent class.
//5. Access Level: The access level cannot be more restrictive than the overridden method's access level.
//6. @Override Annotation: This annotation is optional but helps to ensure that the method is correctly overridden.

package in.kgcoding.Overriding;

public class Testing {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();


        //Lets Test How Overriding is Runtime Polymorphism
//        castTest(animal);
          castTest(dog);
//        castTest(cat);
    }

    public static void castTest(Animal ani){
        ani.sound();
    }
}
