package in.kgcoding.challenge103;

public class ThreadState extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.printf("From inside run %s \n",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
