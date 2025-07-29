//Create a fixed thread pool with a specified number of threads using Executors.newFixedThreadPool(int).
//Submit multiple tasks to this executor, where each task should print the current thread's name and sleep
//for a random time between 1 and 5 seconds. Finally, shut down the executor and handle
//proper termination using awaitTermination

package ProgrammingChallenges.src.in.kgcoding.challenge107;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        PrintTask task1 = new PrintTask();
        PrintTask task2 = new PrintTask();
        PrintTask task3 = new PrintTask();
        PrintTask task4 = new PrintTask();
        PrintTask task5 = new PrintTask();

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.submit(task5);

        service.shutdown();
    }
}
