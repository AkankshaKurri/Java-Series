//Create a program that shows bitwise complement of a number.

import java.util.Scanner;

public class Challenge27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int a = scanner.nextInt();
        int c = ~ a ;
        System.out.println("Your result is:" + c);
    }
}

