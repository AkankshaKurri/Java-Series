//Create a program using for each to find the maximum value in an integer array

class MaxArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        int max = findMax(array);
        System.out.println("Maximum number is:" + max);
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}


//This is Sir code
//class MaxArray {
//    public static void main(String[] args) {
//        System.out.println("Welcome to finding the maximum\n");
//        int[] arr = ArrayUtility.inputArray();
//
//        int max = Integer.MIN_VALUE;
//        for (int num: arr) {
//            if (max < num) {
//                max = num;
//            }
//        }
//
//        System.out.println("Maximum number is: " + max);
//    }
//}
