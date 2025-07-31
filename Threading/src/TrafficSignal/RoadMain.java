package TrafficSignal;

public class RoadMain {
    public static void main(String[] args) throws InterruptedException {
        CreatingThread t1 = new CreatingThread(Signals.RED);
        CreatingThread t2 = new CreatingThread(Signals.GREEN);
        CreatingThread t3 = new CreatingThread(Signals.YELLOW);
        t1.start();
        t1.join();
        System.out.println();
        t2.start();
        t2.join();
        System.out.println();
        t3.start();
        t3.join();
    }
}
