package in.kgcoding.executor.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a fixed thread pool with 3 threads
        // This means at most 3 tasks can run in parallel
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Create a PrintTask object that prints '*' character
        PrintTask task1 = new PrintTask('*');

        // Create a PrintTask object that prints '$' character
        PrintTask task2 = new PrintTask('$');

        // Create a PrintTask object that prints '#' character
        PrintTask task3 = new PrintTask('#');

        // Submit task1 to be executed by one of the threads in the pool
        service.submit(task1);

        // Submit task2 to the thread pool for execution
        service.submit(task2);

        // Submit task3 to the thread pool for execution
        service.submit(task3);

        // Shutdown the thread pool after all submitted tasks are completed
        // No new tasks will be accepted after this
        service.shutdown();

        // Just a checkpoint print to show this part is reached
        System.out.println("***************1");

        // Wait for 2 milliseconds for all tasks to finish
        // If not completed in that time, then force shutdown
        if (!service.awaitTermination(2, TimeUnit.MILLISECONDS)) {
            System.out.println("****************2");
            // Force shutdown immediately if tasks not done within 2ms
            service.shutdownNow();
        }
    }
}
