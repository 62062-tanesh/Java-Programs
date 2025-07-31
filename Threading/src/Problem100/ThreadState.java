package Problem100;

public class ThreadState extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(4);
            System.out.println("From Inside The Thread: "+getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
