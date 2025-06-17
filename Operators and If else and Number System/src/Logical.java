import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Are you male or female? (true/false)");
        boolean isFemale = scanner.nextBoolean();

        if(age < 5){
            System.out.println("You will get 75% discount");
        }
        else if(age > 60 && !isFemale){
            System.out.println("You will get 25% discount")
        }
        else if(isFemale){
            System.out.println("You will get 50% discount");
        }
        else{
            System.out.println("You got no discount");
        }
    }
}
