//Develop a program that prints the multiplication table for a given number.
//using While Loop
import java.util.Scanner;

class MultiplicationTableUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = scanner.nextInt();
        printTable(num);
    }

    public static void printTable(int num){
       int i= 1;
       while(i <= 10){
           System.out.println(num + "*" + i + "=" + num*i);
           i++;
       }
    }
}
