//Create your functional interface with a single abstract method
//that accepts an integer and returns a boolean.
//Implement it using a lambda that checks if the number is prime.


//Is interface ke andar sirf ek abstract method hai: isPrime(int num)

//Functional Interface ka matlab hai ki hum ise lambda expression ke saath use kar sakte hain.
//Matlab: Class banane ki zarurat nahi, seedha method ka body lambda se likh sakte hain.

package ProgrammingChallenges.src.in.kgcoding.challenge113;

// This is a functional interface for checking primes
@FunctionalInterface
public interface Prime {

    // Single abstract method that accepts an integer and returns a boolean
    // Implementations should return true if the number is prime, else false
    boolean isPrime(int num);
}
