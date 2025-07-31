package Problem103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreaded {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newSingleThreadExecutor()){
            Print task = new Print();
            service.submit(task);
        }
    }
}
