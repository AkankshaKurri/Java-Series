//Write a function that calculates the factorial of a given number

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        int factorial = printFactorial(num);
        System.out.println("Factorial is: " + factorial);
    }

    public static int printFactorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            if (n < 2){
                return fact;
            }
           fact *= i;
        }
        return fact;
    }
}
