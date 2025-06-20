import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the no of elements you want in array:");
        int elements = scanner.nextInt();
        int[] nums = new int[elements];
        int i=0;
        while(i < elements){
            System.out.println("Please enter element no."+ (i+1));
             nums[i] = scanner.nextInt();
             i++;
        }
        return nums;
    }

    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the row Size:");
        int rowSize = scanner.nextInt();
        System.out.print("Please enter the column Size:");
        int columnSize = scanner.nextInt();
        int[][] newArr = new int[rowSize][columnSize];

        int i = 0;
        while(i < newArr.length){
            int j=0;
            while(j < newArr[i].length){
                System.out.print("Please enter the number:");
                newArr[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        return newArr;
    }

    public static void display2DArray(int[][] arr){
        int i=0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.print(arr[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
