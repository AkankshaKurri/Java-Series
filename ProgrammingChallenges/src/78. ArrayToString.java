import java.util.Scanner;

class ArrayToString {
    public static void main(String[] args) {
        String[] array = new String[5];
        inputArray(array);
        outputArray(array);
        printString(array);
    }

    public static void inputArray(String[] array){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i < array.length; i++){
            System.out.println("Please enter command:");
            array[i] = scanner.next();
        }
    }

    public static void outputArray(String[] array){
//        for(int i=0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void printString(String[] array){
        StringBuilder sb = new StringBuilder();
//        for(int i=0; i < array.length; i++){
//            sb.append(array[i]);
//        }
        for (String s : array) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}

// class ArrayToString {
//    public static void main(String[] args) {
//        String[] arr = new String[] {"This",
//                "is", "the", "best", "and", "most",
//                "detailed", "course", "on", "java", "on",
//                "the", "internet"};
//        StringBuilder sb = new StringBuilder();
//        for (String str : arr) {
//            sb.append(str).append(" ");
//        }
//        System.out.println(sb);
//    }
// }