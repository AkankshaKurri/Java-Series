//Create a program to check if the given array is sorted

class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome user");
        int[] array = ArrayUtility.inputArray();
        boolean isInc = isIncreasingArray(array);
        boolean isDec = isDecreasingArray(array);
        if( isInc || isDec){
            System.out.println("Your array is sorted");
        }
        else{
            System.out.println("Your array is not sorted");
        }
    }

    //1 2 3 4 5
    public static boolean isIncreasingArray(int[] arr){
        int i = 1 ;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    //5 4 3 2 1
    public static boolean isDecreasingArray(int[] arr){
        int i = 1 ;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
