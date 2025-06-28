// Snake case mei likhne ka
// e.g. STUDENT_MARKS

//Agar koi bhi variable ko change nhi karna hai
//usko hum final declare kar sakte hai
//fir us variable ko kisi bhi tarah change nhi kar sakte hai

//Null Safety: A final variable must be initialized before the constructor completes,
//reducing null pointer errors.

//Immutable Objects: Helps in creating immutable objects in combination with
//private fields and no setter methods.

//Constructor mei assign kar sakte hai.Kyuki constructor call hoti hai object creation ke time.
// Lekin usmei bhi ek hi baar assign kar sakte hai

public class FinalKeyword {
    final double PI = 3.1412;

//    void setPI(int num){
          // cannot reassign final variables
//        PI = num;  //Error:Cannot assign a value to variable PI;
//    }

    public static void main(String[] args) {

    }
}
