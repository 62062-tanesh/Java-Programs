package OptionalClass;

import java.util.List;
import java.util.Optional;

public class Testingoptional {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,5,7,8,5,4);
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b );
        if(sum.isPresent()){
            System.out.println(sum.get());
        }else{
            System.out.println("List is Empty.");
        }
    }
}
