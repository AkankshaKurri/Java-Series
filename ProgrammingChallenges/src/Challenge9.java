import java.util.Scanner;

//Create a program to add two numbers

public class Challenge9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Addition:" +result);
    }
}
