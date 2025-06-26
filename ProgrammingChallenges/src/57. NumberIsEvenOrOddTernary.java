//Create a program to find if the number is even or odd
// Use either ternary operator or switch case

import java.util.Scanner;

class NumberIsEvenOrOddTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number:");
        int num = scanner.nextInt();

        String checkNum = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Number is " + checkNum);
    }
}
