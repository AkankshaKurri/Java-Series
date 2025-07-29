//Write a function that accepts a string and returns an Optional<String>.
//If the string is empty or null, return an empty Optional, otherwise,
//return an Optional containing the uppercase version of the string.

package ProgrammingChallenges.src.in.kgcoding.challenge115;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkString("Akanksha"));
        System.out.println(checkString(""));
        System.out.println(checkString(null));
    }

    public static Optional<String> checkString(String str){
       if(str == null || str.isEmpty()){
           return Optional.empty();
       }
       else{
           return Optional.of(str.toUpperCase());
       }
    }
}
