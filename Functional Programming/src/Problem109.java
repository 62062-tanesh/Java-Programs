import java.util.Scanner;
import java.util.List;

public class Problem109 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(7,5,6,2,3,9);
        numbers.stream().filter(num -> num%2 == 1).forEach(num -> System.out.print(num+" "));
    }
}
