//Set Interface
//1. Unique Elements: Does not allow duplicate elements.
//2. Unordered Collection: It does not guarantee any specific ordering of elements.
//3. No Positional Access: Unlike lists, it doesn't support indexing-based access to elements.
//4. Implementation: Common implementations include HashSet, LinkedHashSet, and TreeSet.

//Set Interface Methods:
//1. add(E e): Adds the specified element to the set.
//             -> Returns True if element has added
//             -> Returns false if element cannot be added.Because set doesn't contains duplicate elements.
//             -> If you provide the same element , then it can't be added.

//2. remove(Object o): Removes the specified element from  the set.
//                     -> Returns True if element has removed.
//                     -> Returns false if element does not exist.

//3. contains(Object o): Checks if the set contains the specified element.
//                       ->This method works very fast as compared to List's "contains" method.

//4. size() : returns the number of elements in the set.

//5. is Empty(): Checks if the set is empty.


package in.kgcoding.collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
         Set<String> names = new HashSet<>();
         names.add("Akanksha");
         names.add("Ramesh");
         names.add("Uma");

        System.out.printf("Collections are: %s",names);
        System.out.println();

        System.out.printf("Size is %d\n",names.size());  // returns 3

        names.add("Akanksha");// it will be not added because it already exists.

        System.out.printf("Collections are: %s",names);
        System.out.println();

        System.out.println(names.contains("Akanksha"));  //returns true
        System.out.println(names.contains("akanksha"));  //returns false

        System.out.println(names.remove("Akanksha"));  //returns true
        System.out.println(names.remove("Akanksha")); // returns false

        System.out.printf("Collections are: %s",names);
        System.out.println();

        System.out.println(names.isEmpty()); //returns false
    }
}
