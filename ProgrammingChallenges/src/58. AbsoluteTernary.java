//Create a program to calculate the absolute value of a given integer.
// Use either ternary or switch case

import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = scanner.nextInt();
        int abs = num >= 0 ? num : -num;
        System.out.println("Absolute value is:" + abs);
    }
}
