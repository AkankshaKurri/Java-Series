//Create a program to search an element in 2-D array

import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome user");
        int[][] array = ArrayUtility.input2DArray();
        System.out.println("Your array is here:");
        ArrayUtility.display2DArray(array);
        System.out.println("Please enter the element you want to search in 2D array:");
        int num = scanner.nextInt();
        boolean isFound = searchElement(array, num);
        if(isFound){
            System.out.println("Hurray!! your Element is found in 2D array");
        }
        else{
            System.out.println("Sorry!! Your Element not found in 2d Array");
        }

    }

    public static boolean searchElement(int[][] arr, int n){
        int i= 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(n == arr[i][j]){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
