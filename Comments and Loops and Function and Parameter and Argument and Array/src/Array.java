//Remember: Array mei length field hota hai
//e.g. myArr.length

public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 78;
//        myArr[1] = 56;
//        myArr[2] = 33;
//        myArr[3] = 23;
//        myArr[4] = 67;
        int[] myArr = {78,56,33,23,67};
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        //Array Traversal
        int index = 0;
        while( index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }


    }
}
