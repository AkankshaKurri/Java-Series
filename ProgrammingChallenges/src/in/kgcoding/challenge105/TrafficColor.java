package in.kgcoding.challenge105;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private int onTimeInMillis;

    TrafficColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }
}
