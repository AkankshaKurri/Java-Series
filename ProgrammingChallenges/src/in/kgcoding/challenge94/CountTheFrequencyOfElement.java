//Use the Collections class to count the frequency of a particular element in an ArrayList.

package in.kgcoding.challenge94;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountTheFrequencyOfElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        System.out.println(numbers);
        countFrequencyOfElement(numbers);
    }

    public static void countFrequencyOfElement(List<Integer> newList) {
        System.out.println(Collections.frequency(newList, 2));
        System.out.println(Collections.frequency(newList, 3));
    }
}
