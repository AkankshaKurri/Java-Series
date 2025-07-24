//1. Purpose of join: The join method is used to make the calling thread wait until the
//                      thread on which join has been called completes its execution.

//2. Synchronization of Threads: join helps in synchronizing multiple threads,
//                               ensuring before the next steps in the calling thread process.

//3. Overloaded Versions: join comes in three versions:
// join(): Waits indefinitely until the thread on which it's called finishes.
// join(long millis): Waits for the thread to die for the specified milliseconds.
// join(long millis, int nanos): Waits for the thread to die for the specified milliseconds plus nanoseconds.

package in.kgcoding.join;

import in.kgcoding.runnable.PrintTask;

public class TestingJoins {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        t1.join(); //"Main thread wait karega t1 ka kaaam khatam hone tak"
        System.out.println("t1 ka kaam khatam hua abh t3 chl jaayega");
        Thread t3 = new Thread(p3);
        t3.start();

        long endTime = System.currentTimeMillis();
        long TotalTime = endTime - startTime;
        System.out.printf("Total time taken is %d", TotalTime);

    }
}
