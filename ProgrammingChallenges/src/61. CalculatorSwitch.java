//Create a program to create a simple calculator that uses a
//switch statement to perform basic arithmetic operations like
//addition, subtraction, multiplication, and division

import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter num 1:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter num 2:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter operation number you want : ");
        System.out.println("Enter 1: Addition");
        System.out.println("Enter 2: Subtraction");
        System.out.println("Enter 3: Multiplication");
        System.out.println("Enter 4: Division");
        int num = scanner.nextInt();
        switch(num){
            case 1 -> System.out.println(num1+num2);
            case 2 -> System.out.println(num1-num2);
            case 3 -> System.out.println(num1*num2);
            case 4 -> {
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Error:Division by zero");
                }
            }
            default -> System.out.println("Invalid choice");
        };
    }
}
