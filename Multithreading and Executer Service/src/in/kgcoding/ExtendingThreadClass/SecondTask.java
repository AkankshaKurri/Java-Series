package in.kgcoding.ExtendingThreadClass;

public class SecondTask extends Thread{
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int j = 1; j <= 100 ; j++){
            System.out.printf("%d$ ", j);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("\n %s Second task completed in %d\n", Thread.currentThread().getName(), endTime-startTime);
    }
}
