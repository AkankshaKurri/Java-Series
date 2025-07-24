package in.kgcoding.challenge105;

public class TrafficLight extends Thread{
    private final TrafficColor colour;

    public TrafficLight(TrafficColor colour) {
        this.colour = colour;
    }

    @Override
    public void run() {
        System.out.printf("%s Active\n" ,colour);
        try {
            Thread.sleep(colour.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", colour);
    }
}
