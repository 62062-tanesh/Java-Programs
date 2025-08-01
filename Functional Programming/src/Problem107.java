import java.util.List;

public class Problem107 {
    public static void main(String[] args) {
        List<String> list = List.of("Tanesh","Raj","Rahul","Ved","Ashu","Bob");
        list.stream().forEach(print -> System.out.println(print));
    }
}
