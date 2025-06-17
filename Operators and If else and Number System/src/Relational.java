import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        //Relational Operators
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("You are eligible for driving license");
        }
        else{
            System.out.println("You are not eligible for driving license");
        }
    }
}
