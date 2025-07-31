package Problem100;

public class TestRun {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.println("Creation of The Thread: "+t1.getState());
        t1.start();
        t1.join();
        System.out.println("End Of The The Thread: "+t1.getState());
    }
}
