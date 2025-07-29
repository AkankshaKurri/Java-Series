//1. Purpose Syntax & Usage: A method reference is described using ::
//(double colon) syntax. For example, System.out::println refers to the
//println method of the System.out object.
//2.Functional Interfaces: They are used with functional interfaces.
//3.Benefit: They make your code more readable and concise
//4.Limitation: They can only be used for methods that fit the
//parameters and return type.

//Syntax:
//•Static Method References:
//ClassName::staticMethodName
//•Instance Method:
//instance::instanceMethodName
//•Instance Method Particular Class:
//ClassName::methodName
//•Constructor References:
//ClassName::new.

import java.util.List;

public class TestingMethodReferences {
    public static void main(String[] args) {
        // Create an immutable list of numbers
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // 1. Print only odd numbers using filter and method reference
        numbers.stream()
                .filter(num -> num % 2 != 0)    // keep odd numbers
                .forEach(System.out::println);  // method reference instead of (x -> System.out.println(x))

        // Create a list of strings
        List<String> strArr = List.of("ABC DEF GHI","EFG", "HIJ", "KLM","PQR STU VWX YZ");

        // 2. Filter strings of length >= 10 and concatenate them using reduce()
        String result = strArr.stream()
                .filter(str -> str.length() >= 10)  // only long strings
                .reduce("", String::concat);        // reduce with "" as identity, and String::concat as combiner
        System.out.println(result);

        // 3. Print all strings using forEach with method reference
        List<String> strArr2 = List.of("ABC","EFG", "HIJ","LMN","PQR");
        strArr2.stream().forEach(System.out::println);

        // 4. Sum of all numbers using reduce and method reference Integer::sum
        int sum3 = numbers.stream()
                .reduce(0, Integer::sum); // identity = 0, BinaryOperator = Integer::sum
        System.out.printf("Printing sum using lambda: %d", sum3);
    }
}
