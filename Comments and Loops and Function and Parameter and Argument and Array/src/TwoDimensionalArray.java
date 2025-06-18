public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        array[0][0]= 10;
        array[0][1]= 20;
        array[0][2]= 30;
        array[1][0]= 40;
        array[1][1]=50;
        array[1][2]=60;
        System.out.println(array[0][0]);


        int[][] newArr = {{1,2,3},{4,5,6},{7,8,9}};

        //Traversal of Two Dimensional Array
        int i=0;
        while(i < newArr.length){
            int j=0;
            while(j < newArr[i].length){
                System.out.print(newArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
