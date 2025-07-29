//Lambda Expressions.
//1.Shortcuts: Lambda expressions are quick, nameless functions for small tasks.
//2.Syntax: Written as (parameters) -> {body}, linking inputs to actions.
//3.Functional Interfaces: They work with interfaces that have only one method, making code concise.
//4.Readability: They make code shorter and clearer, especially with collections.
//5.Useful with Collections: Great for managing lists and sets, like filtering or sorting.

public class TestingLambda {
    public static void main(String[] args) {
        //No arguments
        //() -> System.out.println("Hello");

        //One argument
        //toPrint -> System.out.println(toPrint);

        //Two arguments(Single line)
        //(a, b) -> a + b;

        //Two arguments(Multi Line)
        //(a, b) -> {
        //   int sum = a + b;
        //   System.out.println(sum);
        //}

        //With explicit argument types:
        //(Integer x, Integer y) -> x + y;

        //Simple addition
        //(int a, int b) -> a + b;

        //Multiple statements
        // (x, y ){
        //     System.out.println(x);
        //     System.out.println(y);
        //     return(x + y);
        // }

        //Check if a number is Even:
        //(int number) -> number % 2 == 0;

        // Print a Message:
        //(String message) -> System.out.println(message);

        //Sort a List of Strings by Length:
        //(String s1, String s2) -> s1.length() - s2.length();

        //Runnable with Lambda (No Parameters):
        //() -> System.out.println("Hello world!");
    }
}
