package in.kgcoding.executor.testingfuture;

import java.util.concurrent.Callable;

// This class implements Callable and returns a String result.
// Callable is similar to Runnable, but it returns a result and can throw checked exceptions.
public class FetchName implements Callable<String> {

    private final String name; // Name to be processed

    // Constructor initializes the name field
    public FetchName(String name) {
        this.name = name;
    }

    // This method is executed when the task is submitted to an ExecutorService (with submit()).
    // It simulates a time-consuming task by sleeping for 4 seconds,
    // then returns a modified version of the name.
    @Override
    public String call() throws Exception {
        // Simulate fetching data from a server
        System.out.printf("\n Getting the %S from server.......", name);
        Thread.sleep(4000); // Simulates delay (like a network/database call)

        // Return the fetched/processed result
        return name + " Bhartiya";
    }
}