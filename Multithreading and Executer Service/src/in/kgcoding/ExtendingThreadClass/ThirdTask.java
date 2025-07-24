package in.kgcoding.ExtendingThreadClass;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int k = 0; k <= 100; k++) {
            System.out.printf("%d# ", k);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s Third task completed in %d \n", Thread.currentThread().getName(), endTime - startTime);
    }
}
