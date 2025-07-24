//Write a program that sorts a list of String objects in descending
//order using a custom Comparator.

//        | Return Value | Meaning                    | Effect in Sorting     |
//        | ------------ | -------------------------- | --------------------- |
//        | `-1`         | `o1` comes **before** `o2` | `o1 < o2`             |
//        | `0`          | `o1` is **equal to** `o2`  | No change in position |
//        | `1`          | `o1` comes **after** `o2`  | `o1 > o2`             |


package in.kgcoding.challenge93;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class customComparator {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Ant");
        strList.add("Zebra");
        strList.add("Lion");
        strList.add("Ball");
        sortInAscending(strList);
        System.out.println(strList);
        sortInDescending(strList);
        System.out.println(strList);
    }

    public static void sortInDescending(List<String> newstrList){
//        Collections.reverse(newstrList);
        Collections.sort(newstrList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Agar dono string same hain
                if(o1.equals(o2)){
                    return 0; // koi badlav nahi
                }
                // Agar pehla word chhota hai dusre se (ASCII ke hisaab se)
                else if(o1.charAt(0) < o2.charAt(0)){
                    return 1; // o2 pehle aayega
                }
                else {
                    return -1; // o1 pehle aayega
                }
            }
        });
    }

    public static void sortInAscending(List<String> newstrList){
        //Collections.sort(newstrList);
        Collections.sort(newstrList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Agar dono string same hain
                if(o1.equals(o2)){
                    return 0; // koi badlav nahi
                }
                // Agar pehla word chhota hai dusre se
                else if(o1.charAt(0) < o2.charAt(0)){
                    return -1; // o1 pehle aayega
                }
                else {
                    return 1; // o2 pehle aayega
                }
            }
        });
    }
}
