//Create a program using continue to sum all positive numbers entered by the user, skip any negative numbers.

import java.util.Scanner;

class SumPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        int sum = 0;

        //For each
        for (int j : array) {
            if (j < 0) {
                continue;
            }
            sum += j;
        }

        //For loop
//        for(int i = 0 ; i < array.length; i++){
//            if ( array[i] < 0){
//                continue;
//            }
//            sum += array[i];
//        }
        System.out.println(sum);
    }
}
