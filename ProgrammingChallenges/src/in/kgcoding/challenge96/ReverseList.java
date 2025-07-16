//Create a program that reverses the elements of a list and prints the Reversed List.

package in.kgcoding.challenge96;

import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        reverse(numbers);
        System.out.println(numbers);
    }

    public static void reverse(List<Integer> newList){
//        Collections.reverse(newList);

        for(int i= 0 ; i < newList.size()/2; i++){
            swap(newList, i , newList.size() - 1 - i);
        }
    }

    public static void swap(List<Integer> list , int x, int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
