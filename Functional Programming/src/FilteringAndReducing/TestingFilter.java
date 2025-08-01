package FilteringAndReducing;
import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","Mango","Papaya");
        System.out.println(fruits.size());
        for(String i : fruits){
            System.out.println(i);
        }
        System.out.println("Printing with Streams");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("With Lambda Expression");
        fruits.stream().filter(fruite -> fruite.endsWith("e")).forEach(fruit -> System.out.println(fruit));
    }

}
