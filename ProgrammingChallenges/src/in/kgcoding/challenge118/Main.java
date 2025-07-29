//Create a list of strings representing numbers("1", "2",....).
//Convert each string to an integer, then again calculating\
//squares of each number using the map operation and sum up the resulting integers.

package ProgrammingChallenges.src.in.kgcoding.challenge118;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strArr = List.of("1","2","3");

        //one way
        strArr.stream()
                .map(str -> Integer.parseInt(str))
                .map(num -> Math.pow(num,2))
                .reduce((a,b) -> a + b)
                        .ifPresent(System.out::println);

        //Another way
        strArr.stream()
                .map(Integer::parseInt)
                .map(num -> Math.pow(num,2))
                .reduce(Double::sum)
                .ifPresent(System.out::println);

    }
}
