//1. Java's varargs allow methods to accept any number of arguments.
//2. Declared using an ellipses(...), e.g., void method(int... nums).
//3. Internal Handling: Treated as arrays, e.g., int... nums is int[] nums.
//4. Placement: Must be the last in the method's parameters.
//5. Usage: Call with varying argument counts, e.g., method(1,2) or method().
//6. Introduced in: Java 5.
//
//✅ Summary of Key Concepts:
//int... a is a varargs parameter (variable-length argument).
//Varargs act like an array internally.
//Varargs must be the last parameter in the method signature.
//You can pass zero or more values to a varargs parameter.

package in.kgcoding.varargs;

public class VarArgs {
    public static void main(String[] args) {
        // Calls sum method with 5 arguments; first=2, second=3, rest in varargs array
        System.out.println(sum(2,3,5,6,7));

        // Calls add with no arguments, so varargs array is empty
        System.out.println(add());

        // Calls add with one argument: a = {1}
        System.out.println(add(1));

        // Calls add with four arguments: a = {1, 2, 3, 4}
        System.out.println(add(1,2,3,4));
    }

    // Method that accepts two regular integers and a variable number of additional integers
    public static int sum(int first, int second, int... a) {
        // Start with the sum of the first two required integers
        int sum = first + second;

        // Loop through each integer in the varargs array 'a'
        for (int i : a) {
            // Add each value to the sum
            sum += i;
        }

        // Return the final computed sum
        return sum;
    }

    // add method that accepts zero or more integers using varargs
    public static int add(int... a) {
        int sum = 0; // Initialize sum to 0

        // Loop through each number in the varargs array 'a'
        for (int i : a) {
            sum += i; // Add each number to the sum
        }

        // Return the total sum
        return sum;
    }
}
