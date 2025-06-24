//Create a program to merge two sorted arrays

class MergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("Welcome User");
        int[] inp1 = ArrayUtility.inputArray();
        int[] inp2 = ArrayUtility.inputArray();
        int[] merge = mergedArray(inp1 , inp2);
        System.out.println("Merged Array is:");
        ArrayUtility.displayArray(merge);
    }

    public static int[] mergedArray(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];

        //arr1 ke liye i, arr2 ke liye j, arr3 ke liye k
        int i = 0 , j = 0 , k = 0;
        while(i < arr1.length || j < arr2.length ){
            if(j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j]) ){
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
