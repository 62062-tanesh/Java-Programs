package TrafficSignal;

public enum Signals {
    RED(5000),
    GREEN(3000),
    YELLOW(1000);

    public final int OnTimeInMillis;

    Signals(int OnTimeInMillis){
        this.OnTimeInMillis = OnTimeInMillis;
    }

}
