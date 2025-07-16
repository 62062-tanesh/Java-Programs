import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.append("Tanesh");
        System.out.println("Append The word Tanesh Into Hello: "+str);
        str.insert(5,' ');
        System.out.println("Add A Space at 5th Index: "+str);
        str.deleteCharAt(6);
        System.out.println("Delete The 6th Index Character: "+str);
        System.out.println("Reverse String: "+str.reverse());
        str.delete(1,5);
        System.out.println("Deleted Characer between 1st to 4th Index: "+ str);

    }
}
