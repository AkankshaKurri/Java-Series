//Create a program to calculate the sum of Diagonal elements

public class Challenge53 {
    public static void main(String[] args) {
        System.out.println("Welcome User");
        int[][] array = ArrayUtility.input2DArray();
        System.out.println("Your array is here:");
        ArrayUtility.display2DArray(array);
        int sum = sumOfDiagonals(array);
        System.out.println("Sum of 2D Array is:" + sum);
    }

    public static int sumOfDiagonals(int[][] arr){
        //1 2 3
        //4 5 6
        //7 8 9
        int leftDiagonal = sumOfLeftDiagonal(arr);
        int rightDiagonal = sumOfRightDiagonal(arr);
        int sum = leftDiagonal + rightDiagonal;
        if(arr.length % 2 != 0){
            int mid = arr.length / 2;
            sum -= arr[mid][mid];
        }
        return sum;
    }

    public static int sumOfLeftDiagonal(int[][] arr){
        int leftSum=0;
        int i=0;
        while(i < arr.length){
            leftSum+=arr[i][i];
            i++;
        }
        return leftSum;
    }

    public static int sumOfRightDiagonal(int[][] arr){
         int rightSum=0;
         int row =0;
         while(row < arr.length){
             int col= arr.length - 1 - row;
             rightSum+= arr[row][col];
             row++;
         }
         return rightSum;
    }

}
