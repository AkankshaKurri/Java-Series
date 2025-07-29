//Yahaan Prime type ka ek variable banaya: checkprime.
// num -> { ... } iska matlab:
//num parameter lega
//{ ... } ke andar uska implementation likh diya jo normal method ke andar hota.
//Normal tarike se aisa karte:

//Jab call karte hain:
//System.out.println(checkprime.isPrime(15));
//Ab checkprime.isPrime(15) call hone par lambda ka code execute hoga.
//Wo for loop chalata hai:
//15 ko 2 se lekar 14 tak divide karke check karta hai.
//15 % 3 == 0 (divisible), isliye return false.
//Output: false

//4. Flow kaise chal raha hai?
//Program start hota hai.
//Prime checkprime = num -> { ... } line execute hoti hai.
//Iska matlab ek function ka implementation memory me store ho gaya.
//checkprime.isPrime(15) likhne par wo function chal jaata hai jo lambda me likha hai.

//Short summary:
//Functional interface ek contract deta hai: ek method hoga.
//Lambda us method ka body provide karta hai bina class banaye.
//Jab .isPrime() call karte ho, lambda ke andar ka code execute hota hai.


package ProgrammingChallenges.src.in.kgcoding.challenge113;

public class TestingFunctionalInterface {
    public static void main(String[] args) {
        // Create a lambda expression that implements the Prime interface
        // 'checkprime' is a variable of type Prime (functional interface)
        // Lambda: takes an int 'num' and returns true if 'num' is prime
        Prime checkprime = num -> {
            // Loop from 2 to num-1
            for (int i = 2; i < num; i++) {
                // If num is divisible by i, then num is not prime
                if(num % i == 0){
                    return false; // immediately return false
                }
            }
            // If loop completes, num has no divisors other than 1 and itself
            return true;
        };

        // Call the lambda through the functional interface method 'isPrime'
        // It will check whether 15 is a prime number
        System.out.println(checkprime.isPrime(15)); // Expected output: false
    }
}

