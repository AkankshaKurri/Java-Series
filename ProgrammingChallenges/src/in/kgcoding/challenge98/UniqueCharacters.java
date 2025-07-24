//Write a program that takes a string and returns the number of unique characters using a Set

//HashSet is a class in Java that stores a group of unique elements — it does not allow duplicates.

//1. str.toCharArray()
//toCharArray() ek String ko character array me convert karta hai.
//Example:
//String str = "apple";
//str.toCharArray() → ['a', 'p', 'p', 'l', 'e']

//2. for (char ch : str.toCharArray())
//Ye loop har character (ch) ko ek-ek karke uthata hai string me se.
//ch = 'a'
//ch = 'p'
//ch = 'p'
//ch = 'l'
//ch = 'e'

//3. unique.add(ch);
//Ye ch ko Set me daalta hai.
//Set duplicate values ko ignore karta hai, toh agar same character baar-baar aaye, wo ek hi baar count hoga.

package in.kgcoding.challenge98;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.println("Please enter your String:");
        String str = input.next();

        for (char ch : str.toCharArray() ){
            unique.add(ch);
        }

        System.out.printf("Unique characters in your string are : %d",unique.size());
    }
}
