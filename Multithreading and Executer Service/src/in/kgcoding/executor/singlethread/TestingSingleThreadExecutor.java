package in.kgcoding.executor.singlethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) {
        // Create a single-threaded executor
        // This means tasks submitted will be executed one at a time, in order
        ExecutorService service = Executors.newSingleThreadExecutor();

        // Create a PrintTask object with character '*'
        // This task will likely print '*' multiple times
        PrintTask task1 = new PrintTask('*');

        // Create another PrintTask object with character '$'
        PrintTask task2 = new PrintTask('$');

        // Create a third PrintTask object with character '#'
        PrintTask task3 = new PrintTask('#');

        // Submit task1 to the executor service
        // It will be scheduled for execution by the single thread
        service.submit(task1);

        // Submit task2 to the executor
        // Since only one thread is available, this will wait until task1 is done
        service.submit(task2);

        // Submit task3 to the executor
        // This will run after task2 finishes
        service.submit(task3);

        // Shutdown the executor after all submitted tasks are completed
        // No new tasks will be accepted after this point
        service.shutdown();
    }
}
