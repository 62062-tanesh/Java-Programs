import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapElementsInArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,7,5,6);
        System.out.println(list.size());
        System.out.println(list);
        swap(list, 3,2);
        System.out.println(list);

    }
    public static void swap(List<Integer> list, int i, int j){
        int swap = list.get(i);
        list.set(i, list.get(j));
        list.set(j,swap);
    }
}
