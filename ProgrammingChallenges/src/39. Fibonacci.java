//Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = scanner.nextInt();
        printFibonacci(n);
    }

    public static void printFibonacci(int num){
        // a = 0 , b = 1 , c = 0 + 1 = 1
        // a = b , b = c ;     a = 1, b = 1, c = 1 + 1 = 2
        int fibonacci;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        int c ;
        int i = 1;
        while (i < num ){
            c = a + b;
            System.out.print(c + " ");
            a = c ;
            b = a ;
            i++;
        }
    }
}
