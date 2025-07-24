package in.kgcoding.ExtendingThreadClass;

public class FirstTask extends Thread{
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ", i);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s First task completed in %d \n", Thread.currentThread().getName(), endTime-startTime);
    }
}
