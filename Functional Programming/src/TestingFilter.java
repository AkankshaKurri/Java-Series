//What is a Stream?
//1. Element Sequence: Streams represent a sequence of elements
//2.Functional Operations: Operations like map, filter, and reduce.
//3.No Storage: Streams don't store data; they process it on-the-fly from
//sources like collections or arrays.
//4.Efficiency: Stream operations can be lazy, processing elements only as
//needed, which is efficient for large data.
//5.One-Time Use: Streams are consumable; once processed, they cannot be.
//6.Parallel Capable: They support parallel processing, making operations
//faster by utilizing multiple threads.

//Filtering
//1. Purpose: Used to filter elements of a stream based on a given
//predicate (a condition). Only elements that satisfy the
//condition are included in the resulting stream.
//2. Lazy Operation: It's a lazy operation, meaning it's not executed
//until a terminal operation (like collect or forEach) is invoked on
//the stream.
//3. Returns a Stream: filter itself returns a new stream with
//elements that match the predicate.


import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        // Create an immutable list of fruits using List.of()
        List<String> fruits = List.of("Banana", "Apple", "Cherry", "Mango");

        // Print the size of the list
        System.out.println(fruits.size());

        // 1. Printing using traditional enhanced-for loop
        System.out.println("Printing fruits using for");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. Printing using Stream and forEach with an explicit Consumer class
        System.out.println("Printing fruits using Streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                // The accept method of Consumer interface prints each fruit
                System.out.println(fruit);
            }
        });

        // 3. Printing using stream, filter, and lambda
        System.out.println("Printing fruits using filter");
        fruits.stream()
                // filter() keeps only fruits that end with "a"
                .filter(fruit -> fruit.endsWith("a"))
                // forEach() with a lambda prints the filtered fruits
                .forEach(fruit -> System.out.println(fruit));
    }
}
