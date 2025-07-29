//Intermediate Operations
// 1. Laziness: Executed only when a terminal operation is invoked, setting
// up a pipeline without processing data.
// 2. Stream Transformation: Transform one stream into another, e.g.,
// filter, map. They're chainable, allowing multiple transformations.
// 3. State Handling: Can be stateless (like map) or stateful(like sorted),
// affecting processing.

//Terminal Operations
//1. Computation Trigger: Initiates the stream processing and closes the
//stream. After this, the stream can't be reused.
//2. Final Outcome: Produces a result (like a sum or list) or a side-effect
//(like printing each element). Not chainable.
//3. Examples: Operations like collect, forEach, reduce, sum, max, min,
//and count are terminal.

//Max, Min, Collect to List
//1. max() finds the largest element in
//the stream according to a given
//comparator or natural ordering.
//2.min() identifies the smallest element
//in the stream based on a provided
//comparator or natural ordering.
//3.collect(Collectors.toList()) gathers
//all the elements of the stream into a
//new List.

//Sort, Distinct, Map
//1. sorted() orders the elements of a stream
//based on their natural order or a provided
//comparator.
//2.distinct() filters out duplicate elements,
//ensuring that every element in the resulting
//stream is unique.
//3.map() applies a function to each element of a
//stream, transforming them into a new stream
//of results based on the function logic.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
         List<Integer> numbers = List.of(4,2,5,1,3);

         //Max
         Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
         maxNumber.ifPresent(System.out::println);

         //Min
         Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
         minNumber.ifPresent(System.out::println);

         //Sorted
         List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
         System.out.println(sortedNumbers);

         List<String> items = List.of("apple", "banana", "apple", "orange", "banana");

         //Distinct
         List<String> distinctItems = items.stream().distinct().collect(Collectors.toList());
         System.out.println(distinctItems);

         List<String> words = Arrays.asList("Stream", "Operations", "Java");

         //collect to list
         List<String> collectedWords = words.stream().collect(Collectors.toList());
         System.out.println(collectedWords);

         //Map
         List<String> uppercaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
         System.out.println(uppercaseWords);
    }
}
