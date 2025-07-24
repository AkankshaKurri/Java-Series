package in.kgcoding.challenge104;

public class JoinExample extends Thread{
    private final int threadNumber;

    public JoinExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("Thread Started: %s and Thread Number: %d\n",Thread.currentThread().getName(), threadNumber);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Thread ended: %s and Thread Number: %d\n", Thread.currentThread().getName(), threadNumber);
    }
}
