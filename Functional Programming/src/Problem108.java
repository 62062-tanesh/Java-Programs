import java.util.List;

public class Problem108 {
    public static void main(String[] args) {
        List<String> list = List.of("Name","Tanesh","New","Tum","RajveerKumar","Where are you going");
        String result = list.stream().filter(str -> str.length() > 10).reduce("", (a,b) -> a + " " + b);
        System.out.println(result);
    }
}
