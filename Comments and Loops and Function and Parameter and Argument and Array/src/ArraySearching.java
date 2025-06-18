import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Welcome to array searching");
        System.out.println("Please enter the number you want to found:");
        int num = scanner.nextInt();
        boolean isFound = checkNum(arr,num);
        if(isFound){
            System.out.println("Yes your number found in array");
        }
        else{
            System.out.println("No your number not found in array");
        }

        String[] strArr = new String[4];
        strArr[0] = "Hii";
        strArr[1] = "Akanksha";
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);

        String[] newStrArr = {"Hii" , "Hello",};
        System.out.println(newStrArr[0]);
        System.out.println(newStrArr[1]);
        System.out.println(newStrArr.length);

    }

    public static boolean checkNum(int[] array, int number){
        int index = 0;
        while(index < array.length){
            if(number == array[index]){
                return true;
            }
            index++;
        }
        return false;
    }

}
