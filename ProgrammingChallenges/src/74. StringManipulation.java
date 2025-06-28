//Concatenate and Convert: Take two Strings, concatenate them,
// and convert the result into uppercase

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any text:");
        String str1 = scanner.next();
        System.out.println("Please enter any text:");
        String str2 = scanner.next();
        String concatenation = str1.concat(" ").concat(str2);
        System.out.println(concatenation.toLowerCase());
    }
}
