//Create a program to find the minimum of two numbers
//Use either switch case or ternary operator


import java.util.Scanner;
class MinimumOfTwoNumbersTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter number 2:");
        int num2 = scanner.nextInt();

        int min = num1 < num2 ? num1 : num2;

        System.out.println("Minimum is "+ min);


    }

}
