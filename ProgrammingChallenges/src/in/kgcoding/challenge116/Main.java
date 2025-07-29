//Given an array of integers, create a stream,
//use the distinct operation to remove duplicates, and collect the result into a new list.

package ProgrammingChallenges.src.in.kgcoding.challenge116;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,6,5,4,8,7,4,3,2,1);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNumbers);
    }
}
