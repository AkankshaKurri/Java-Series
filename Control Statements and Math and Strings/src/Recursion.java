//Remember: base is very important in recursion
//Otherwise it runs infinite

import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number you want to know the factorial of that number: ");
        int num = scanner.nextInt();
        if(num < 0){
            System.out.println("Please provide the positive integer: ");
        }
        else{
            long factorial = Factorial(num);
            System.out.println("Factorial is:" + factorial);
        }
    }
    public static long Factorial(int n){
        long fact = 1;
        if(n == 1 || n == 0){
            return 1;
        }
        else{
           fact =  n * Factorial(n - 1);
        }
        return fact;
    }
}


//This is Sir Code
//import java.util.Scanner;
//
//public class Recursion {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Factorial generator\n");
//        System.out.print("Please enter your number: ");
//        int num = input.nextInt();
//        long fact = factorial(num);
//        System.out.println("Factorial of your number is: " + fact);
//    }
//
//    public static long factorial(int num) {
//        System.out.println("Function called for: " + num);
//        if (num == 1) {
//            return 1;
//        }
//        return num * factorial(num - 1);
//    }
//
//    public static long factorialIterative(int num) {
//        long result = 1;
//        for (int i = 1; i <= num; i++) {
//            result *= i;
//        }
//        return result;
//    }
//}