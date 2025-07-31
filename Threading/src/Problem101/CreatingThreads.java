package Problem101;

public class CreatingThreads extends Thread {

    private final char Name;

    CreatingThreads(char Name){
        this.Name = Name;
    }

    @Override
    public void run(){
        System.out.println("Thread Starting: "+Name);
        System.out.println("I am Thread "+Name);
        System.out.println("Thread Ended: "+Name);
    }
}
