//Need of Multithreading
//1. Tasks might be very important.
//2. Tasks are independent of each other.
//3. A Multi-core CPU is sitting idle most of the time.
//4. A big task can be divided into smaller parts.
//5. Making your code responsive.

package in.kgcoding.multithreading;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n* task completed\n");

        //Second Task
        for (int j = 1; j <= 1000 ; j++){
            System.out.printf("%d$ ", j);
        }
        System.out.println("\n$ task completed\n");

        //Third Task
        for (int k = 0; k <= 1000; k++) {
            System.out.printf("%d#", k);
        }
        System.out.println("\n$ task completed\n");
        long endTime = System.currentTimeMillis();
        long Total = endTime - startTime;
        System.out.println(Total);
    }
}