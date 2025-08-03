import java.util.List;
import java.util.stream.Collectors;

public class TestinDistinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,5,3,4,2,3,4);

        List<Integer> distinctNumber = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumber);
    }
}
