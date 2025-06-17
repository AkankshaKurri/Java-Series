//Create a program to convert Fahrenheit to Celsius
//deg C = (deg F -32)* 5/9
import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Fahrenheit:");
        int fah = scanner.nextInt();
        int cel = (fah - 32)* 5/9;
        System.out.println("Degree celsius:"+ cel+ "C");
    }
}
