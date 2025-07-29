//Convert an array of strings into a stream.
//Then, use the stream to print each string to the console.

package ProgrammingChallenges.src.in.kgcoding.challenge110;

import java.util.List;

public class Main {
    public static void main(String[] args) {
         List<String> strArr = List.of("ABC","EFG", "HIJ","LMN","PQR");
         strArr.stream().forEach(str -> System.out.println(str));
    }
}
