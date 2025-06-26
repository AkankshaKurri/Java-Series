//Create a program using for each to the occurences of a specific element in an array

import java.util.Scanner;

class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        System.out.println("Please enter the number: ");
        int num = scanner.nextInt();
        int occurences = countOccurences(array, num);
        System.out.println("No of Occurrences of "+num+" are " + occurences);
    }

    public static int countOccurences(int[] arr, int n){
        int count = 0;
        for(int i : arr){
            if(i == n){
                count++;
            }
        }
        return  count;
    }
}
