//Write a program that creates two threads.
//Each thread should print "Hello from Thread X". where the number of the thread(1 or 2),
//ten times, then terminate.

package in.kgcoding.challenge102;

public class TestingThread {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread(1);
        t1.start();
        HelloThread t2 = new HelloThread(2);
        t2.start();
    }
}
