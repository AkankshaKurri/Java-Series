//Write a program that starts a thread and prints its state after each significant event(creation, starting, and termination).
//Use Thread.sleep() to simulate long-running tasks and Thread.getState() to print th thread's state.

package in.kgcoding.challenge103;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Created the Thread: %s\n", t1.getState());
        t1.start();
        System.out.printf("Started the Thread: %s\n", t1.getState());
        t1.join();
        System.out.printf("Thread finished: %s\n", t1.getState());
    }
}
