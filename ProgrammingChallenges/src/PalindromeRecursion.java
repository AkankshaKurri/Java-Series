//Create a program using recursion to check if a string is palindrome using recursion.

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any string: ");
        String str = scanner.next();
        boolean isPalindrome = checkPalindrome(str);
        System.out.println((isPalindrome) ? "Yes it is Palindrome" : "No It is not palindrome");
    }

    public static boolean checkPalindrome(String str){
        int lastPos = str.length() - 1;
        if(str.length() <= 1){
           return true;
        }
        if(str.charAt(0) != str.charAt(lastPos)){
           return false;
        }
        String newStr = str.substring(1, lastPos);
        return checkPalindrome(newStr);
    }
}
