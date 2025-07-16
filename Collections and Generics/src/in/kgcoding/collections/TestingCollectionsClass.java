//Collections Class
//1. Offers methods like sort to sort lists.
//2. Provides methods  like binarySearch for searching sorted lists.
//3. Allows reversing the order of elements in a list with reverse.
//4. Can shuffle the elements of a list randomly using shuffle.
//5. Creates unmodifiable collections using methods like unmodifiableList, etc.
//6. Methods like singletonList, create immutable collections with a single element.
//7. The copy method is used to copy all elements from ine list to another.

package in.kgcoding.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollectionsClass {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(6);
        printList(numList);

        Collections.sort(numList);
        printList(numList);

        Collections.reverse(numList);
        printList(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        //unmodifiable.add(1);  //returns exception (UnsupportedOperationException)

        int max = Collections.max(numList);
        int min = Collections.min(numList);
        System.out.println(max);
        System.out.println(min);



    }

    public static void printList(List<Integer> list) {
        System.out.print("Collections are: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
