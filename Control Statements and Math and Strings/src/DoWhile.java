import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        do {
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
        }while(age<=0 || age >100);
        System.out.println("Your age is " +age);
    }
}
