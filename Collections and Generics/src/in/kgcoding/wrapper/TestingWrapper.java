//Wrapper Class
//1. Provide a way to use primitive data types (int, char, boolean,etc.) as objects.
//2. Automatic conversion between the primitive types and their corresponding wrapper classes.
//3. Once created, the value of a wrapper object cannot be changed.
//4. Utility Methods: Each wrapper class provides useful methods, like compareTo, valueOf, and parseXxx (e.g., parseInt for Integer).
//5. Required for storing primitives in collection like ArrayList, Hashmap.
//6. Allows assignment of null to primitive values when needed.

//Autoboxing: Automatic conversion of primitive types to their corresponding wrapper class objects.
//Unboxing: Automatic conversion of wrapper class objects back to their respective primitive types.

//| **Primitive Type** | **Wrapper Class** |
//| ------------------ | ----------------- |
//| `byte`             | `Byte`            |
//| `short`            | `Short`           |
//| `int`              | `Integer`         |
//| `long`             | `Long`            |
//| `float`            | `Float`           |
//| `double`           | `Double`          |
//| `char`             | `Character`       |
//| `boolean`          | `Boolean`         |

package in.kgcoding.wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
        // 1. Use primitive types as objects
        Integer intObj = Integer.valueOf(10);   // int -> Integer object
        Character charObj = Character.valueOf('A'); // char -> Character object
        Boolean boolObj = Boolean.valueOf(true); // boolean -> Boolean object

        // 2. Autoboxing & Unboxing (Automatic conversion)
        int num = 20;
        Integer boxedNum = num; // autoboxing (primitive to object)
        int unboxedNum = boxedNum; // unboxing (object to primitive)
        System.out.println("Autoboxed: " + boxedNum + ", Unboxed: " + unboxedNum);

        // 3. Wrapper objects are immutable
        Integer original = 100;
        Integer modified = original + 50;
        System.out.println("Original: " + original);  // still 100
        System.out.println("Modified: " + modified);  // 150

        // 4. Utility methods
        int compareResult = Integer.valueOf(5).compareTo(10);  // returns negative
        int parsed = Integer.parseInt("123");  // String to int
        Integer fromString = Integer.valueOf("456"); // String to Integer
        System.out.println("compareTo result: " + compareResult);
        System.out.println("parseInt: " + parsed);
        System.out.println("valueOf: " + fromString);
    }
}
