package TrafficSignal;

public class CreatingThread extends Thread{

    private final Signals color;

    CreatingThread(Signals color){
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(color+ " Active Now");
        try {
            Thread.sleep(color.OnTimeInMillis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(color+ " Inactive Now");
    }
}
