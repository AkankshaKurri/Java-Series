package ProgrammingChallenges.src.in.kgcoding.challenge106;

public class PrintTask implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d ", i);
        }
    }
}
