//Simulate a dice roll using Math.random() and display the outcome(1-6)


class Dice {

    // Method to simulate a dice roll, returns an integer between 1 and 6
    int roll(){
        int result;  // Declare an integer variable to store the final result

        // Generate a random number between 0.0 (inclusive) and 6.0 (exclusive)
        double random = (Math.random() * 6);

        // Add 1 to make the range [1.0, 7.0), then round up using Math.ceil()
        // Cast to int to discard decimal part; possible results: 1 to 6
        result = (int) Math.ceil(random + 1);

        // Return the final dice value (1 to 6)
        return result;
    }


    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println(dice.roll());
    }
}
