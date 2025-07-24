//🔁 What happens:
//When you write:

//Counter counter = new Counter();          // Step 1: Create actual object

//UpdaterThread t1 = new UpdaterThread(counter);   // Step 2: Pass that object to thread
//💡 Matlab:
//counter object heap memory mein banta hai (e.g., address = 0xAAA123)

//UpdaterThread ka constructor jab call hota hai:
//public UpdaterThread(Counter counter) {
//    this.counter = counter;
//}

//Tab:
//counter parameter = 0xAAA123 (jo main se aaya)
//this.counter (thread ka member variable) = 0xAAA123

//✅ Diagram:
//[ Heap ]
//---------------------------------------------------
//| Counter Object         | Address: 0xAAA123       |
//| count = 0              |                        |
//---------------------------------------------------
//| UpdaterThread Object   | Address: 0xBBB999       |
//| counter = 0xAAA123     | ← reference to Counter  |
//---------------------------------------------------

//[ Stack (main method) ]
//-------------------------------
//| counter = 0xAAA123          |
//| t1 = 0xBBB999               |
//-------------------------------



package in.kgcoding.synchronize;

public class UpdaterThread extends Thread{
      private Counter counter;

      public UpdaterThread(Counter counter){
          this.counter = counter;
      }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
