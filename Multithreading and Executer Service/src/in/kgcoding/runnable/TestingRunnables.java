//In this main method, three threads(t1,t2,t3) are created and started.
// They will execute independently and print their values.

//States of Thread
//1. New -> Thread us created but not started
//2. Runnable -> Thread is ready or running.
//3. Running -> Thread is actively executing tasks.
//4. Blocked/Waiting -> Thread is alive but not active beacause it's waiting for resources or other threads.
//5. Terminated -> Thread has finished or stopped running.


package in.kgcoding.runnable;

public class TestingRunnables {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        long endTime = System.currentTimeMillis();
        long TotalTime = endTime - startTime;
        System.out.printf("Total time taken is %d", TotalTime);

    }
}
