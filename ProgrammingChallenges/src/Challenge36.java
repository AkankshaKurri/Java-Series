//Create a program to find Greatest Common Divisor(GCD) of two integers..

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Challenge36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = scanner.nextInt();
        int gcd = printGCD(num1, num2);
        System.out.println("GCD is "+ gcd);
    }

    public static int printGCD(int n1, int n2){
        // 12   18  -> gcd is 6
        int gcd = 1;
        int i = 2;
        int least = least(n1, n2);
        while(i <= least){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int firstNum, int secondNum){
        if(firstNum > secondNum){
            return firstNum;
        }
        else{
            return secondNum;
        }
    }
}
