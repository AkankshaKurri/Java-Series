import java.util.Scanner;

//Create a program to input name of the person and respond with "Welcome NAME to KG Coding"
class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");
    }
}
