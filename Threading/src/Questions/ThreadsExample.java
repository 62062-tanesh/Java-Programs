package Questions;

public class ThreadsExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(1);
        Thread1 t2 = new Thread1(2);
        t1.start();
        t2.start();
    }
}
