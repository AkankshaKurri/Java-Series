//Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int a = scanner.nextInt();
        if ((a & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
