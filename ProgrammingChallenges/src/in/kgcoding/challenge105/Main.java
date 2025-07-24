//Simulate a traffic signal using threads.
//Create three threads representing three signals: RED, YELLOW, and GREEN.
//Each signal should be on for certain time,
//then switching to the next signal in order.
//Use sleep for timing and synchronize to make sure only one signal is active at a time.


package in.kgcoding.challenge105;

public class Main {
    public static void main(String[] args) throws InterruptedException {
          TrafficLight red = new TrafficLight(TrafficColor.RED);
          TrafficLight yellow = new TrafficLight(TrafficColor.YELLOW);
          TrafficLight green = new TrafficLight(TrafficColor.GREEN);

          red.start();
          red.join();
          yellow.start();
          yellow.join();
          green.start();
          green.join();

    }
}
