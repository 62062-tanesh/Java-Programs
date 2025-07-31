package Problem101;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CreatingThreads t1 = new CreatingThreads('A');
        CreatingThreads t2 = new CreatingThreads('B');
        CreatingThreads t3 = new CreatingThreads('C');
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
