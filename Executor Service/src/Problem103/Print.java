package Problem103;

public class Print implements Runnable {
    @Override
    public void run() {
        for(int i=1; i<11; i++){
            System.out.println("Number Is: "+i);
        }
    }
}
