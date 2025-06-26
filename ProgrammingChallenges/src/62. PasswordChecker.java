//Create a program using do-while to find password checker until a valid password is entered

import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do{
            System.out.println("Please enter your password:");
            password = scanner.nextLine();
        }while(!isValidPassword(password));
        System.out.println("OKKKKKKKK");
    }

    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
