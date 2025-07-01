//Create a number guessing game where the program selects a random number, and the user has to get it.

import java.util.Scanner;

//class GuessingGame {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double random = Math.random() * 10;
//        int numByComputer = (int) Math.ceil(random);
//        int numByUser;
//        do{
//            System.out.println("Enter number:");
//            numByUser = scanner.nextInt();
//        }while(numByUser != numByComputer);
//        System.out.println("Hurray!! You have guessed right!");
//        System.out.println("The number was"+numByComputer);
//    }
//}

class GuessingGame {

    int random;

    // Constructor to generate random number between 1 and 100
    GuessingGame() {
        random = (int) (Math.random() * 100) + 1;
    }

    /**
     *
     * @param guessedNumber  the number that player guessed
     * @return
     * - Negative if guessedNumber is smaller
     * - Positive if guessedNumber is higher
     * - 0 if correct
     */
    int checkNum(int guessedNumber){
       return guessedNumber - random;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame guess = new GuessingGame();
        System.out.println("Welcome to Guessing game.Please enter number between 1 to 100");
        int result;
        int number;
        do{
            System.out.println("Guess the number:");
            number = scanner.nextInt();
            result = guess.checkNum(number);
            if(result == 0){
                System.out.println("Hurray, you have guessed right!!!!!");
            } else if (result <  0) {
                System.out.println("Guess Higher Number: ");
            }else{
                System.out.println("Guess Lower Number: ");
            }
        }while(result != 0);
    }
}



