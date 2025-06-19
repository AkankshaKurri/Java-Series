//Create a program to return a new array deleting a specific element

import java.util.Scanner;

public class Challenge47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome User");
        int[] array = ArrayUtility.inputArray();
        System.out.println("Please enter number you want to delete:");
        int numToDelete = scanner.nextInt();
        int[] newArray = deleteElement(numToDelete , array);
        System.out.println("Here is your new Array:");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteElement(int n, int[] arr){
        int noOfOccurrence = countNum(arr, n);

        if( noOfOccurrence == 0){
            return arr;
        }

        int newSize = arr.length - noOfOccurrence;
        int[] newArr = new int[newSize];


        int i = 0, j=0;
        while(i < arr.length){
             if(arr[i] != n){
                newArr[j] = arr[i];
                j++;
             }
             i++;
        }
        return newArr;
    }

    public static int countNum(int[] arr, int num){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if(num == arr[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
