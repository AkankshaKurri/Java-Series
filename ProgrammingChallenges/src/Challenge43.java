//Create a program to find the sum and average of all elements in an array

public class Challenge43 {
    public static void main(String[] args) {
        System.out.println("Welcome User");
        int[] array = ArrayUtility.inputArray();
        int summation = calculateSum(array);
        System.out.println("Sum is:" + summation);
        float average = calculateAvg(array);
        System.out.println("Average is:" + average);
    }

    public static int calculateSum(int[] arr){
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static float calculateAvg(int[] arr){
        int sum = calculateSum(arr);
        int length = arr.length;
        return (float)  sum / length ;
    }
}
