//Given a list of strings, use stream operations to filter out strings
//that have length of 10 or more and then concatenate the remaining strings.

package ProgrammingChallenges.src.in.kgcoding.challenge111;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strArr = List.of("ABC DEF GHI","EFG", "HIJ", "KLM","PQR STU VWX YZ");
        String result = strArr.stream()
                .filter(str -> str.length() >= 10)
                .reduce("",(a,b) -> a.concat(b));
        System.out.println(result);

        //THIS IS SIR CODE
        List<String> strArr2 = List.of("ABC DEF GHI","EFG", "HIJ", "KLM","PQR STU VWX YZ");
        String result2 = strArr2.stream()
                .filter(str -> str.length() >= 10)
                .reduce("",(a,b) -> a + " " + b);
        System.out.println(result2);
    }
}
