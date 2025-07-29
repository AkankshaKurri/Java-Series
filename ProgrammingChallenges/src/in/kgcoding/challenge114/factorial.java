//Write two versions of a program that calculates the factorial
//of a number: one using structural(procedural) programming,
//and the other using functional programming.

package ProgrammingChallenges.src.in.kgcoding.challenge114;

import java.util.stream.IntStream;

public class factorial {
    public static void main(String[] args) {
        //Structural(procedural).
        System.out.println(calculateFactorial(5));

        //Functional programming.
        int num=5;
        IntStream.rangeClosed(2,num)
                .reduce((a,b) -> a*b)
                .ifPresent(System.out::println);
    }
    public static int calculateFactorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        int fact = 1;
        for(int i = 1 ; i<=num ; i++){
            fact *= i;
        }
        return fact;
    }
}
