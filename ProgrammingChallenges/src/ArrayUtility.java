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
}
