//In the main method, three threads(t1,t2,and t3) are created and started.
//They will execute independently and print their values.

package in.kgcoding.ExtendingThreadClass;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        System.out.println("Starting First Thread");
        t1.start();
        System.out.println("Starting Second Thread");
        t2.start();
        System.out.println("Starting Third Thread");
        t3.start();
    }
}
