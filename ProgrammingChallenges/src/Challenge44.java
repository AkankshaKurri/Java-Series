//Create a program to find number of occurrences of an element in an array.

import java.util.Scanner;

public class Challenge44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome User");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Please enter the number you want to found in array:");
        int num = scanner.nextInt();
        int noOfOccurences = countNum(num, arr);
        System.out.println("No of occurences"+ noOfOccurences);
        if(noOfOccurences != 0){
            System.out.println("Number Found");
        }
        else{
            System.out.println("Number not Found");
        }
    }

    public static int countNum(int n, int[] array){
        int i= 0;
        int count = 0;
        while(i < array.length){
            if(n == array[i]){
                count++;
            }
            i++;
        }
        return count;
    }

}
