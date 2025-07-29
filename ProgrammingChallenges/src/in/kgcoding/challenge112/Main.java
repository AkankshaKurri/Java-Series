//Given a list of integers, use stream operations to filter odd numbers and print them.

package ProgrammingChallenges.src.in.kgcoding.challenge112;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter(num -> num%2!=0)
                .forEach(num -> System.out.println(num));

        //THIS IS SIR CODE
        List<Integer> numbers2 = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers2.stream()
                .filter(num -> num%2 == 1)
                .forEach(num -> System.out.println(num));
    }
}
