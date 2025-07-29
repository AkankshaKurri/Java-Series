//Write a program that uses an executor service to execute multiple Callable tasks.
//Each task should calculate and return the factorial of a number provided to it.
//Use Future objects to receive the results of the calculations.
//After all tasks are submitted, retrieve the results from the futures, print them, and ensurr the executor service is shutdown correctly.

package ProgrammingChallenges.src.in.kgcoding.challenge108;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) {
        // Creating a thread pool with 3 threads using ExecutorService
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            // List to store Future objects that will hold the result of the factorial computations
            //This creates an empty list named list that will store Future<Integer> objects.
            //Each Future<Integer> will eventually hold the result (factorial value) of a submitted task.
            //Future is used with Callable, which runs in a separate thread and returns a result in the future.
            List<Future<Integer>> list = new ArrayList<>();

            //This loop goes through each Future in the list
            //future.get() is called, which:
            //Blocks the current thread until the result is available.
            //Retrieves the result of the corresponding factorial task.
            //System.out.printf() then prints the result.

            // Submitting 10 tasks (to calculate factorials from 0 to 9) to the executor service
            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i); // Creating task for number i
                list.add(service.submit(task)); // Submitting task and storing Future result
            }

            // Iterating over the Future list to get and print the results
            for (Future<Integer> future : list) {
                System.out.printf("\n Result is: %d", future.get()); // .get() blocks until result is available
            }

            // Requesting shutdown of the ExecutorService - no new tasks will be accepted
            service.shutdown();

            // Wait for all tasks to complete within 10 seconds
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("BOHOT HUA BUS....."); // Message if tasks take too long
                service.shutdown(); // Force shutdown (just in case)
            }

        } catch (InterruptedException | ExecutionException e) {
            // Handling exceptions thrown during task execution
            throw new RuntimeException(e);
        }
    }
}