//Create a program to find the maximum and minimum element in an array

class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome User");
        int[] array = ArrayUtility.inputArray();
        int max = findMax(array);
        int min = findMin(array);
        System.out.println("Maximum number is:" +max);
        System.out.println("Minimum number is:" +min);
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        int i = 0;
        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        int i = 0;
        while(i < arr.length){
            if(arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}


// This is Sir Code
//class MaxMinArray {
//    public static void main(String[] args) {
//        System.out.println("Welcome to Max and Min\n");
//        int[] numArr = ArrayUtility.inputArray();
//        int max = max(numArr);
//        int min = min(numArr);
//        System.out.println("Max of the Array is: " + max);
//        System.out.println("Min of the Array is: " + min);
//    }
//
//    public static int min(int[] numArr) {
//        int min = Integer.MAX_VALUE;
//        int i = 0;
//        while (i < numArr.length) {
//            if (min > numArr[i]) {
//                min = numArr[i];
//            }
//            i++;
//        }
//        return min;
//    }
//    public static int max(int[] numArr) {
//        if (numArr.length == 0) {
//            return Integer.MIN_VALUE;
//        }
//        int max = numArr[0];
//        int i = 1;
//        while (i < numArr.length) {
//            if (max < numArr[i]) {
//                max = numArr[i];
//            }
//            i++;
//        }
//        return max;
//    }
//}
