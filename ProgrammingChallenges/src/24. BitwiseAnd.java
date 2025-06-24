//Create a program that shows bitwise AND of two numbers.

import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int a = scanner.nextInt();
        System.out.println("Please enter second number:");
        int b = scanner.nextInt();
        int c = (a & b);
        System.out.println("Your result is:" + c);
    }
}
