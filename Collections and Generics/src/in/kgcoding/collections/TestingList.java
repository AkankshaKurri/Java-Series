//List Interface
//1. An ordered collection(also known as a sequence)
//2. Allows duplicate elements.
//3. Elements can be accessed by their integer index.
//4. Maintains the insertion order of elements.
//5. Performance: Offers fast random access and quick iteration.
//6. Capacity: Grows automatically as elements are added.
//7. Preferred over arrays when the size is dynamic or unknown.

//List Methods
//1.add(E e): appends the specified element.
//2. add(int index, E element): Inserts at specified position.
//3. remove(Object o): Removes the first occurrence of the specified element.
//4. remove(int index): Removes the element at the specified position.
//5. get(int index): Returns the element at the specified position.
//6. set(int index, E element): Replaces the element at the specified position.
//7. size(): Returns the number of elements.
//8. clear(): Removes all of the elements.
//9. contains(Object o): Returns' true' if the list contains the specified element.
//10. indexOf(Object o): Returns the index of the first occurrence, or -1 if the list does not contain the element.


package in.kgcoding.collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        //<String> means this List will store only String type elements.
        //Generics are a compile-time feature (ensures type safety during compilation).
        //Due to type erasure, generics are removed at runtime.

        // <String> , <> -> yeh generics hai
        //              -> yeh generics compile time hai
        //              -> yeh generics compile time pe delete hoti hai

        //✅ Creates a List that stores String objects, implemented using an ArrayList.
        //<> (diamond operator) infers type from the left-hand side: <String>.
        List<String> strList = new ArrayList<>();
        strList.add("Akanksha");
        strList.add("Kurri");

        strList.add(1, "Ramesh");

        strList.remove(1);

        //List ka jo "contains" method hai, woh slow hai as compared to Set
        //Because yeh ek ek element ko scheck karta hai match ho rha hai ya nhi
        if(strList.contains("Akanksha")){
            System.out.printf("Yes it exists at %d\n", strList.indexOf("Akanksha"));
        }

        for(int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }

        System.out.println();

        for(String str : strList){
            System.out.print(str);
        }
    }
}
