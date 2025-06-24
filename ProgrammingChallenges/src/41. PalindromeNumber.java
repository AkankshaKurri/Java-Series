//Create a program to verify if a number is a palindrome

import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        int palindrome = isPalindrome(num);
        if(num == palindrome) {
            System.out.println("Yes number is palindrome");
        }
        else{
            System.out.println("No number is not palindrome");
        }
    }

    public static int isPalindrome(int n){
        int result = 0;
        int rem;
        while (n != 0){
            rem = n % 10;
            result = result * 10 + rem;
            n = n / 10 ;
        }
        return result;
    }
}
