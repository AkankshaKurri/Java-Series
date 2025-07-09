//Final Variable => To create constant variables.

//Variable becomes a constant, meaning its value cannot be changed once initialized.

//Null Safety: A final variable must be initialized before the constructor completes, reducing null pointer errors.

//Efficiency:Using final can lead to performance optimization, as the compiler can make certain assumptions about final elements.

//Immutable Objects: Helps in creating immutable objects in combination with private fields and no setter methods

package in.kgcoding.Final_Keyword;

public class FinalVariableExample {
    final int MAX_VALUE = 100;  // final variable

    void show() {
        //MAX_VALUE = 200;  ❌ Not allowed
        System.out.println("Max value is: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.show();
    }
}
