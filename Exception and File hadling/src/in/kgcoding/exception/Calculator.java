//In Java, an exception is a disruptive event that occurs during the execution of a program,
//interrupting its normal flow. It's an instance of a problem that arises while the program is running,
//such as arithmetic errors, null pointer accesses, or resource overflows.

//Exceptions are objects in Java that encapsulate information about an error event,
//including its type and the state of the program when he error occurred.

//Try catch Block
//Try Block: Contains code that is susceptible to exceptions.
//Catch Block: Follows the try block and handles the exceptions thrown by the try block.
//When an exception occurs in the try block, the control is transferred to the catch block where the exception is handled.

//Types of Exceptions:
//1.User-Defined Exceptions

//2.Built-in Exceptions
//->Checked Exceptions: These are exceptions that must be either caught or declared in the method.
//->Unchecked Exceptions: These are exceptions that do not need to be explicitly handled.

//Checked Exception: handle karna, declare karna compulsory hai.
//1.ClassNotFoundException
//2.InterruptedException
//3.IOException
//4.InstantiationException
//5.SQLException
//6.FileNotFoundException

//UncheckedException: aapki choice hai. Aapko handle karna hai toh handle kare,warna nhi chahte ho to nahi kare.
//1.ArithmeticException
//2.ClassCastException
//3.NullPointerException
//4.ArrayIndexOutOfBoundException
//5.ArrayStoreException
//6.IllegalThreadStateException

package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Please enter two numbers:");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        try {
            int[] a = new int[5];
            System.out.printf("Result is:%d", a[6]);
            // ❌ This line throws ArrayIndexOutOfBoundsException (invalid index 6)

            int result = first / second;
            // ⚠️ This line is **not reached** if above exception is thrown

            System.out.printf("Result is:%d", result);
            // Will print only if no exception occurs
        }
        catch(ArithmeticException exception){
            // Catches division by zero errors
            System.out.printf("%s\n Please Enter valid values.", exception.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException exception){
            // ✅ This block WILL execute due to a[6] access
            System.out.printf("%s\n",exception.getMessage());

        }catch(Throwable th){  //Jo humne define kiya hai upar(exceptions), woh agar exception nhi aaya toh yeh execute hoga. Kyuki Throwable toh sabhi ka parent hota hai.
            // Catches any other unexpected exception (Throwable is parent of all Errors and Exceptions)
            System.out.println("General Exception");
            // Generic message for unknown exceptions.
        }
    }
}
