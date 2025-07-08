import java.util.*;

class ConvertIntoCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter The Second String: ");
        String str2 = sc.nextLine();
        String bothName = str1.concat(" ").concat(str2);
        System.out.println("The Combination is: "+bothName);
        System.out.println(bothName.toUpperCase());
    }
}
