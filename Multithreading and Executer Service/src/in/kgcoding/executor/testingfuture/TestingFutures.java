package in.kgcoding.executor.testingfuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a fixed thread pool with 2 threads
        // Only 2 tasks can run at the same time
        ExecutorService service = Executors.newFixedThreadPool(2);

        // Create 5 FetchName tasks with different names
        FetchName task1 = new FetchName("ABC");
        FetchName task2 = new FetchName("XYZ");
        FetchName task3 = new FetchName("PQR");
        FetchName task4 = new FetchName("MNO");
        FetchName task5 = new FetchName("EFG");

        // Submit each task to the ExecutorService
        // submit() returns a Future<String> which will hold the result later
        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);
        Future<String> name5 = service.submit(task5);

        // Call get() on each Future to wait for and retrieve the result
        // This blocks the current thread until the result is available
        System.out.printf("\nName 1 Fetched: %s", name1.get());
        System.out.printf("\nName 2 Fetched: %s", name2.get());
        System.out.printf("\nName 3 Fetched: %s", name3.get());
        System.out.printf("\nName 4 Fetched: %s", name4.get());
        System.out.printf("\nName 5 Fetched: %s", name5.get());

        // Shut down the executor service
        service.shutdown();
    }
}
