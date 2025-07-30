import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.print("Enter Your String: ");
        String input = sc.nextLine();
        for(char ch : input.toCharArray()){
            unique.add(ch);
        }
        System.out.println(unique.size());
    }
}
