//Create three threads.
//Ensure that the second thread starts only after the first thread ends
//and the third thread starts only after the second thread ends using the join method.
//Each thread should print its start and end along with its name.

package in.kgcoding.challenge104;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JoinExample t1 = new JoinExample(1);
        JoinExample t2 = new JoinExample(2);
        JoinExample t3 = new JoinExample(3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
