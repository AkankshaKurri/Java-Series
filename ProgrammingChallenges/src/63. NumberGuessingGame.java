//Create a program using do-while to implement a number guessing game.

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 3 , 4 , 6};
        int num;
        do {
            System.out.println("Guess the number from 1 to 10:");
            num = scanner.nextInt();
        }while(!isCorrect(numbers, num));
    }

    public static boolean isCorrect(int[] numbers, int num){
        int i = 0;
        while(i < numbers.length){
            if(num == numbers[i]){
                return true;
            }
            i++;
        }
        return false;
    }

}

//Tis is Sir Code
//import java.util.Scanner;
//
//class NumberGuessingGame {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = 5, guess;
//        System.out.println("Welcome to the number guessing game");
//        do {
//            System.out.print("Please guess the number between 0 and 10: ");
//            guess = input.nextInt();
//        } while (num != guess);
//        System.out.println("You have successfully guessed the number");
//    }
//}