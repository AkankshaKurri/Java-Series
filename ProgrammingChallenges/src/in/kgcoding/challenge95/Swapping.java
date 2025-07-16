//Write a method that swaps two elements in an ArrayList, given their indices.

package in.kgcoding.challenge95;

import java.util.Arrays;
import java.util.List;

public class Swapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        swap(list, 2 ,3);
        System.out.println(list);
    }

    public static void swap(List<Integer> list,int x, int y) {
        int swap = list.get(x);   //3
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
