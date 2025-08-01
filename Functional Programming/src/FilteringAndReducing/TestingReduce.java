package FilteringAndReducing;

import java.util.List;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,2,5,6,3);
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        System.out.println(sum);
    }
}
