//Create a program that determines if a number is odd or even

import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
       int num = scanner.nextInt();
       if (num % 2 == 0 ){
           System.out.println("Number is Even");
       }
       else{
           System.out.println("Number is odd");
       }
    }
}
