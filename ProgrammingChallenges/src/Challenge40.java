//Create a program to check if a number is an Armstrong number.

//Armstrong numbers are numbers where the sum of their digits raised to the power of the number of digits is equal to the number itself.

//Some common Armstrong numbers include: 153, 370, 371, 407, 1634, 8208, 9474

import java.util.Scanner;

public class Challenge40 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter number: ");
         int n = scanner.nextInt();
         int armStrongNum = printArmstrongNumber(n);
         if (armStrongNum == n) {
            System.out.println(n + " is an Armstrong number.");
         } else {
            System.out.println(n + " is not an Armstrong number.");
         }
    }

    public static int printArmstrongNumber(int num){
        // 153 -> how many digits --> 3
        // so 1^ 3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

        int noOfDigits = countDigits(num);
        System.out.println("No of Digits:" + noOfDigits);
        int rem;
        int newNum = 0;

        while (num != 0){
            rem = num % 10;
            newNum += Math.pow(rem, noOfDigits);
            num = num / 10;
        }
        return newNum;
    }

    public static int countDigits(int num){
        int count = 0;
        while (num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}

//This is Sir code

//class ArmstrongNumber {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Armstrong Number");
//        System.out.print("Please enter your number: ");
//        int num = input.nextInt();
//        boolean isArmstrong = isArmstrong(num);
//        if (isArmstrong) {
//            System.out.println("Your number is Armstrong");
//        } else {
//            System.out.println("Your number is not Armstrong");
//        }
//    }
//
//    public static boolean isArmstrong(int num) {
//        int noOfDigits = noOfDigits(num);
//        int numCopy = num;
//        int finalNumber = 0;
//        while (num > 0) {
//            int lastDigit = num % 10;
//            num /= 10;
//            finalNumber += pow(lastDigit, noOfDigits);
//        }
//        return finalNumber == numCopy;
//    }
//
//    public static int pow(int num1, int num2) {
//        int result = 1;
//        int i = 0;
//        while (i < num2) {
//            result *= num1;
//            i++;
//        }
//        return result;
//    }
//
//    public static int noOfDigits(int num) {
//        int digits = 0;
//        while (num > 0) {
//            digits++;
//            num /= 10;
//        }
//        return digits;
//    }
//}

