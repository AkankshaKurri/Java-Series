//Create a program to reverse the digits of a number.

import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int num = scanner.nextInt();
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed Number:"+ reversedNum);
    }

    public static int reverseNumber(int n){
        // 123     123 % 10 = 3  123 / 10 = 12
        //         12 % 10 = 2   12 /10  = 1
        //          1 % 10 = 1   1 / 10 = 0
        int i = 1;
        int newNum = 0;
        int digit;
        while(n != 0){
            digit = n % 10;
            newNum = newNum * 10 + digit;
            n = n / 10;
        }
        return newNum;
    }
}
