//Method overloading: Method Overloading occurs when multiple methods in the same class have the same name but different parameter lists.
//Parameter Difference: Overloaded methods must differ in the number,type, or sequence of their parameters.
//Return Type: Can vary between overloaded methods, but the return type alone does not distinguish them.
//Compile-Time Polymorphism: It's a form of polymorphism that is resolved during compile time.

package in.kgcoding.Overloading;

public class Overloading {

    Overloading(){
        System.out.println("Default constructor called");
    }

    Overloading(String pop){
        System.out.println("Parameterized Constructor called");
        System.out.println(pop);
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        int summation1 = overloading.add(10,5);
        System.out.println(summation1);
        int summation2 = overloading.add(1,2,3,4);
        System.out.println(summation2);
        String summation3 = overloading.add("Hello","World");
        System.out.println(summation3);

        Overloading overloading1 = new Overloading("Hello");

    }
}
