package Problem104;

public class SleepTask implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println("Current Thread: "+current.getName());
        try {
            Thread.sleep(getRandom());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ended with Thread: "+current.getName());
    }
    private int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int)random;
    }
}
