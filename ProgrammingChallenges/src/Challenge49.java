//Create a program to check is the array is palindrome or not


public class Challenge49 {
    public static void main(String[] args) {
        System.out.println("Welcome user");
        int[] array = ArrayUtility.inputArray();
        boolean isPPalindrome = checkPalindrome(array);
        if(isPPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean checkPalindrome(int[] arr) {
        int i = 0;
        while(i < arr.length / 2){
            if(arr[i] != arr[(arr.length - 1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
