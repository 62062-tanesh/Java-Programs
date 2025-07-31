package Questions;

public class Thread1 extends Thread{
    private final int ThreadNumber;

    public Thread1(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;
    }
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println((i+1)+" Hello From Thread "+ThreadNumber);
        }
    }
}
