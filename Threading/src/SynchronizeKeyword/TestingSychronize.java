package SynchronizeKeyword;

public class TestingSychronize {
    public static void main(String[] args) {
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted"+e.getMessage());
        }

        System.out.println("Final Count is: "+counter.getCount());
    }
}
