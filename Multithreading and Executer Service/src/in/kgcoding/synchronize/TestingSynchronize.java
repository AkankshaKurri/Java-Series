//Synchronize Keyword

//1.Mutual Exclusion: The synchronize keyword in Java ensures that only one thread can execute a block of code at a time,
//                   providing mutual exclusion and preventing race conditions.

//2. Object Lock: When a thread enters a synchronized block or method , it acquires a lock on the object or class,
//                  depending on whether the method is an instance method or a static method.

//3. Visibility: It ensures that changes made by one thread to shared data are visible to other thread.

//✅ Step 1: Main Method Creates Shared Counter
//🧠 Memory Layout (Heap & Stack)
//
//        [ Heap Memory ]
//        ---------------------
//        | Counter Object     |
//        | count = 0          | ← 📍Address: 0xABC
//        ---------------------
//
//        [ Stack - main() ]
//        ---------------------
//        | counter = 0xABC    | (reference to the object above)
//        ---------------------

//✅ Step 2: Create UpdaterThread and Pass counter
//UpdaterThread t1 = new UpdaterThread(counter);

//This calls:
//public UpdaterThread(Counter counter) {
//    this.counter = counter;
//}

//➡️ this.counter = reference to the same object in memory

//[ Heap Memory ]
//---------------------
//| Counter Object     |
//| count = 0          | ← 📍0xABC
//---------------------
//| UpdaterThread t1   |
//| counter → 0xABC    | (same object)
//---------------------
//Same if you create another thread t2:

//UpdaterThread t2 = new UpdaterThread(counter);

//[ Heap Memory ]
//---------------------
//| UpdaterThread t2   |
//| counter → 0xABC    | (same Counter)
//---------------------

//✅ Step 3: Thread Starts Running

//t1.start(); → t1.run()
//Inside:
//for (int i = 0; i < 1000; i++) {
//    counter.increment();  // count++
//}
//➡️ Thread t1 accesses the shared Counter object and increases count 1000 times.
//Same for t2.

package in.kgcoding.synchronize;

public class TestingSynchronize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try{
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }catch (InterruptedException exception){
            System.out.println(exception.getMessage());
        }

        long endTime = System.currentTimeMillis();
        long TotalTime = endTime - startTime;
        System.out.printf("Final counter is %d and Time taken is %d", counter.getCount(), TotalTime);

    }
}
