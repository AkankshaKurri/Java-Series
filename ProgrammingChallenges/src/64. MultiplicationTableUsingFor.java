//Create a program using for loop multiplication table for a number.

import java.util.Scanner;

class MultiplicationTableUsingFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Number: ");
        int num = scanner.nextInt();
        printTable(num);
    }

    public static void printTable(int num){
        for(int i=1; i <= 10; i++){
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
