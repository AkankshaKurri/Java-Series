//1.Executes code after the try-catch blocks, used mainly for cleanup operation.
//2. Always runs regardless of whether an exception is thrown or caught in the try-catch blocks.
//3. Ideal for closing resources like files or database connections to prevent resource leaks.

package in.kgcoding.finally_Block;

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
        }finally{
            System.out.println("I am in finally block.");
            // ✅ This will ALWAYS run, no matter what — even if an exception occurs or is rethrown
        }
    }
}
