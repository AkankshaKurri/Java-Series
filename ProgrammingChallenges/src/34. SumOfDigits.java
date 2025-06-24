//Create a program that computes the sum of the digits of an integer
import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please enter number:");
          int num = scanner.nextInt();
          int sum = printSumOfDigits(num);
          System.out.println(sum);
    }

    public static int printSumOfDigits(int num){
        int sum = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }
}
