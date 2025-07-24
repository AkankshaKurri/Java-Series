//1. Purpose: ExecutorService is a framework provided by the Java Concurrency API to manage and execute
//            submitted tasks without the need to manually manage thread life cycles.

//2. Thread Pool Management: ExecutorService efficiently reuses a fixed pool of threads to execute tasks,
//                           thereby improving performance by reducing the overhead of thread creation,
//                           especially for short-lived asynchronous tasks.

package in.kgcoding.executor.multithread;

public class PrintTask implements Runnable{
    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i , targetChar);
        }
        System.out.printf("\n%s %c task complete\n", Thread.currentThread().getName(), targetChar);
    }
}
