//Write a method concatenate Strings that takes variable arguments of String type
//and concatenates them into a single string.

package in.kgcoding.challenge92;

public class ConcatStrings {
    public static void main(String[] args) {
         concatStrings("Akanksha","Ramesh");
         concatStrings("a","b","c");
    }

    public static void concatStrings(String... strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
