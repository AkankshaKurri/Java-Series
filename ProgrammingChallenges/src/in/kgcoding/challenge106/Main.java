//Write a program that creates a single-threaded executor service.
//Define and submit a simple Runnable task that prints numbers from 1 to 10.
//After submission, shut down the executor.


package ProgrammingChallenges.src.in.kgcoding.challenge106;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the ExecutorService
        // Executors.newSingleThreadExecutor() creates a thread pool with a single thread
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {

            // Create a task (should implement Runnable or Callable)
            PrintTask task1 = new PrintTask();

            // Submit the task to the executor for execution
            service.submit(task1);
        }
        // No need to explicitly call shutdown() — it's automatically closed at the end of try block
    }
}
