//Write a program that asks the user to enter two integers and then divides the first by second.
//The program should handle any arithmetic exceptions that may occur(like division by zero)
//and display an appropriate message.
// Key Points:
//Use Scanner to read user input.
//Implement a try-catch block to handle ArithmeticException
//Display a user-friendly message if division by zero occurs.


package in.kgcoding.challenge90;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter number:");
            int num1 = scanner.nextInt();
            System.out.println("Please enter number:");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
        } catch (java.lang.ArithmeticException e) {
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Error: Division by zero");
            }else{
                throw e;
            }
        } finally {
            System.out.println("All work done");
        }
    }
}
