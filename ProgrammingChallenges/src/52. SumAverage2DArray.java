//Create a program to do sum and average of all elements in 2-D array

class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome User");

        int[][] array = ArrayUtility.input2DArray();

        System.out.println("Your Array is here:");
        ArrayUtility.display2DArray(array);

        int noOfElements = countElements(array);
        System.out.println("Your array includes "+noOfElements + " number of elements");

        int sum = sumOfArray(array);
        int avg = avgOfArray(array);
        System.out.println("Sum is: "+ sum);
        System.out.println("Average is: "+ avg);
    }

    public static int sumOfArray(int[][] arr){
        int sum= 0;
        int i=0;
        while(i < arr.length){
            int j=0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static int avgOfArray(int[][] arr){
        int sum = sumOfArray(arr);
        int noOfElements = countElements(arr);
        return sum / noOfElements;
    }

    public static int countElements(int[][] arr){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            int j= 0;
            while(j < arr[i].length){
                count++;
                j++;
            }
            i++;
        }
        return count;
    }


}
