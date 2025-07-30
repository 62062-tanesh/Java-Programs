import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> Country = new HashMap<>();
        Country.put("India" , "Delhi");
        Country.put("America" , "NewYork");
        Country.put("United Kingdom" , "London");
        Country.put("Australia" , "Canberra");
        Country.put("Russia" , "Moscow");
        System.out.print("Enter A Country Name: ");
        String Input = sc.nextLine();
        if(Country.containsKey(Input)){
            System.out.println("The Capital of The "+Input+" is: "+Country.get(Input));
        }else{
            System.out.println("Country Is Not Available In My Data.");
        }

    }
}
