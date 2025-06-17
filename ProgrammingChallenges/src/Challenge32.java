//Create a program to sum all odd numbers from 1 to a specified number N

import java.util.Scanner;

public class Challenge32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter starting Number: ");
        int startNum = scanner.nextInt();
        System.out.println("Please enter last Number: ");
        int lastNum = scanner.nextInt();
        printOddNumbers(startNum, lastNum);
    }

    public static void printOddNumbers(int start, int last){
        int sum = 0;
        for(int i=start ; i <= last ; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("Result is:" +sum);
    }
}
