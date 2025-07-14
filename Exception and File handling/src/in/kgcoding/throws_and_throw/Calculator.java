//throws keyword:

//1. Declares that a method may throw one or more exceptions.
//2. Used in the method signature to indicate that the method might throw exceptions of specified types
//3. A method declared with throws requires the calling method to handle or further declare the exception.
//4. Java throws keyword is used to declare an exception.
//5. checked exception can be propagated with throws.
//6. If we see syntax wise, throws is followed by exception class names.
//   Example: throws IOException,SQLException
//7. throws clause is used in method declaration(signature)
//8. By using throws you can declare multiple exceptions.
//   Example: public void method() throws IOException,SQLException


//throw keyword:

//1. Used to explicitly throw an exception from any method or block of code.
//2. You can throw either a new instance of an exception or an existing exception object using throw.
//   Example: throw new ArithmeticException("Division by zero");
//3. Java throw keyword is used to explicitly throw an exception
//4. Checked exception cannot be propagated using throw.
//5. If we see syntax wise, throw is followed by an instanceof Exception class
//   Example: throw new NumberFormatException("The month entered, is invalid.");
//6. The keyword throw is used inside method body.
//7. By using throw keyword in java you cannot throw more than one exception.
//   Example: throw new IOException("Connection failed!")

//Method chaining (a() → b() → c() → d()):
//Just to demonstrate call stack. If exception occurs in d(), the stack trace will show all methods up to main().

//Exception Handling:
//ArithmeticException is caught specifically.

//Throwable catch block acts as a generic catch for all other problems (e.g., ArrayIndexOutOfBoundsException).
//throw th rethrows the caught exception, which will stop the program unless handled elsewhere.
//that means ->
//"I’ve caught this exception — but I’m not handling it here. I’m passing it back (throwing it again) so someone else can handle it."
//If the re-thrown exception is not caught by another try-catch block in the call stack (like in a higher method), then:
//It goes up the method chain looking for a try-catch that can handle it.
//If no such handler is found, Java prints a stack trace and terminates the program.

//Array Mistake (a[6]):
//Causes ArrayIndexOutOfBoundsException because the array size is 5 (valid indices: 0–4), but index 6 is accessed.


package in.kgcoding.throws_and_throw;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        d();
    }

    public static void d(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Please enter two numbers:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        try {
            int[] a = new int[5];

            // This line has two risks:
            // 1. If 'second' is 0, it will throw ArithmeticException (division by zero)
            // 2. a[6] will throw ArrayIndexOutOfBoundsException (index 6 does not exist)
            a[6] = first / second;

            // This will print the result if no exception occurs
            System.out.printf("Result is:%d", a[6]);
        }
        catch(ArithmeticException exception){
            //Catches division by zero
            System.out.printf("%s\n",exception.getMessage());
            // Prints the error message (e.g., "/ by zero")
        }catch(Throwable th){  //Jo humne define kiya hai upar(exceptions), woh agar exception nhi aaya toh yeh execute hoga. Kyuki Throwable toh sabhi ka parent hota hai.
            // Catches any other exception not specifically caught above
            // 'Throwable' is the superclass of all errors and exceptions in Java
            System.out.println("General Exception");
            // Prints a general error message
            throw th;
            // Rethrows the same exception to propagate it further (not handled here)
        }
    }
}
