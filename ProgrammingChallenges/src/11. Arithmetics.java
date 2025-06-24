//Create a program that takes two numbers and shows result of all arithmetic operators(+,-,/,%)
import java.util.Scanner;

class Arithmetics {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first Number:");
        a = scanner.nextInt();
        System.out.println("Please Enter the second Number:");
        b = scanner.nextInt();
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
        System.out.println("Modulo: "+ (a%b));
    }
}
