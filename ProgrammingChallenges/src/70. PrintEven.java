//Create a program using continue to print only even numbers using continue for odd numbers.

import java.util.Scanner;

class PrintEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();

        for(int num : array){
            if (num % 2 != 0) {
                continue;
            }
            System.out.print(num+ " ");
        }
    }
}
