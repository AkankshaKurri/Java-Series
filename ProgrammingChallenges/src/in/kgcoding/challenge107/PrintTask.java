// | Part                | Meaning                                                                    |
// | ------------------- | -------------------------------------------------------------------------- |
// | `Math.random()`     | Returns a random `double` between `0.0` (inclusive) and `1.0` (exclusive). |
// | `Math.random() * 5` | Returns a `double` between `0.0` (inclusive) and `5.0` (exclusive).        |
// | `+ 1`               | Shifts the range to `1.0` (inclusive) to `6.0` (exclusive).                |


package ProgrammingChallenges.src.in.kgcoding.challenge107;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s started\n",Thread.currentThread().getName());
        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Ended\n\n",Thread.currentThread().getName());
    }

    public int getRandom(){
        double random = (Math.random() * 5 + 1);
        return (int) random;
    }
}
