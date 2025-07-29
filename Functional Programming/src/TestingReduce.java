//Reducing
//1. Purpose: Used to reduce the elements of a stream to a
//single value. It takes a binary operator as a parameter
//and applies it repeatedly, combining the elements of
//the stream.
//2. Versatile: Can be used for summing, finding min or max,
//and combining elements in a myriad of ways.
//3. Optional or Default Value: Without an identity value,
//reduce returns an Optional. With an identity value, it
//returns a default value if the stream is empty.

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,5, 3, 5, 8, 6);
        int sum= 0;
        for (int number : numbers){
            sum += number;
        }
        System.out.printf("Printing sum using enhanced for loop: %d\n",sum);

        int sum2 = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.printf("Printing sum using reduce: %d\n" , sum2);

        int sum3 = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.printf("Printing sum using lambda: %d", sum3);

        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b);
        System.out.printf("Maximum number is %d",max);

        int min = numbers.stream().reduce(Integer.MAX_VALUE, (a,b) -> a < b ? a : b);
        System.out.printf("Minimum number is %d", min);

    }
}
