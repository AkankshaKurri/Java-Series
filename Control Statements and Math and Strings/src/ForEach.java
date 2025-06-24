public class ForEach {
    public static void main(String[] args) {
        String[] array = {"Ram", "Shyam", "Geeta"};
        printArrayForEach(array);
        printArrayForLoop(array);
    }

    public static void printArrayForLoop(String[] arr){
        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }



    public static void printArrayForEach(String[] arr){
        for(String name : arr){
            System.out.print(name + " ");
        }
    }
}
