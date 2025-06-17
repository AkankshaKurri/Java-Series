//Create a program to check whether a given number is prime.

import java.util.Scanner;

public class Challenge37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        boolean prime = checkPrime(num);
        if(prime){
            System.out.println("Yes" + num + "is prime");
        }
        else{
            System.out.println("No" + num + "is not prime");
        }
    }

    public static boolean checkPrime(int n){
        int i = 2;
        while(i < n){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
