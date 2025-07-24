//Map Interface
//1. Stores data as key-value pairs.
//2. Each key can map to at most one value.
//3. Keys are unique, but multiple keys can map to the same value.
//4. It is part of the Collections Framework but does not extend the Collection Interface.

//1. put(K key, V value): Associates the specified value with the specified key in the map.
//2. get(Object key): Returns the value to which the specified key is mapped, or null if the map contains no mapping for the key.
//3. remove(Object key): Removes the mapping for a key from the map if it is present.
//4. containsKey(Object key): Checks if the map contains a mapping for the specified key.
//5. keySet(): Returns a Set view of the keys contained in the map.
//6. values(): Returns a Collection view of the values contained in the map.

package in.kgcoding.maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Strawberry", 40);

        System.out.println(map.get("Apple")); //gets value of key:Apple

        //Checks Chickoo exists in map
        System.out.println(map.containsKey("Chickoo")); //returns false

        //Checks Banana exists in map
        System.out.println(map.containsKey("Banana"));  //returns true

        System.out.println(map.size()); //returns size

        System.out.println(map.remove("Banana"));  //Removes and returns the value of key:Banana

        for (String s : map.keySet()) {
            System.out.printf("%s : %s \n", s , map.get(s));
        }
    }
}
