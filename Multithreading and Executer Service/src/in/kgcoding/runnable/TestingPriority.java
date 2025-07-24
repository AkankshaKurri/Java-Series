//Thread Priority
//1. Priority Levels: Java threads have priority levels from 1(lowest) to 10(highest, with a default value of 5.
//2. Influence of Execution: A thread's priority suggests the importance of a thread to the scheduler, though it doesn't guarantee the order of execution.
//3. Set and Get Priority: Use setPriority to change a thread's priority and getPriority() to retrieve it.


//MIN_PRIORITY = 1
//NORM_PRIORITY = 5
//MAX_PRIORITY = 10

//we cannot decide the order of execution.It depends on the operating system.

package in.kgcoding.runnable;

public class TestingPriority {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        long endTime = System.currentTimeMillis();
        long TotalTime = endTime - startTime;
        System.out.printf("Total time taken is %d", TotalTime);

    }
}
