//create a program to reverse an array

class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome user");
        int[] array = ArrayUtility.inputArray();
        int[] reversedArray = reverseArray(array);
        ArrayUtility.displayArray(reversedArray);
    }

    public static int[] reverseArray(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];

        int i = size - 1 , j = 0;
        while(i >= 0){
            if(arr[i] != 0){
                newArr[j] = arr[i];
                j++;
            }
            i--;
        }

        return newArr;
    }
}


//This is Sir Code
//class ReverseArray {
//    public static void main(String[] args) {
//        System.out.println("Welcome to Array Reversal\n");
//        int[] numArr = ArrayUtility.inputArray();
//        reverse(numArr);
//        System.out.println("Your reversed array is");
//        ArrayUtility.displayArray(numArr);
//    }
//
//    public static void reverse(int[] arr) {
//        int i = 0;
//        while (i < arr.length / 2) {
//            int swap = arr[i];
//            arr[i] = arr[(arr.length - 1) - i];
//            arr[(arr.length - 1) - i] = swap;
//            i++;
//        }
//    }
//}
