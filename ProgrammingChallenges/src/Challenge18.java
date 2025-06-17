//Create a program that determine if a number is positive, negative, or zero
import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int num = scanner.nextInt();
        if(num > 0){
            System.out.println("Positive");
        }
        else if (num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
