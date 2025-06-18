import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greetUser();
        int a = readNumber();
        int b = readNumber();
        int sum = a + b ;
        System.out.println("Sum is: "+ sum);
    }

    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        return num;
    }

    public static void greetUser(){
        System.out.println("Hello User");
    }
}
