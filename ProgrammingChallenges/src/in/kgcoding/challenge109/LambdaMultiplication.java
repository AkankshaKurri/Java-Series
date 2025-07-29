//Write a lambda expression that takes two integers and returns their multiplication.
//Then, apply this lambda to a pair of numbers.

package ProgrammingChallenges.src.in.kgcoding.challenge109;

import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        int mulResult = numbers.stream().reduce(1, (a,b) -> a * b);
        System.out.println(mulResult);

        //THIS IS SIR CODE
        // BinaryOperator<T> is a functional interface
        // It takes two arguments of the SAME type and returns the SAME type.

        BinaryOperator<Integer> multi = (a, b) -> a * b;
        // Here, (a, b) -> a * b is a lambda expression
        // It multiplies two Integers and returns the result.

        int result = multi.apply(4, 6); // apply() method executes the lambda
        System.out.println(result);     // Output: 24
    }
}
