import java.util.Scanner;

public class Q20_Categorize_Persons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if(age <= 13){
            System.out.println("You are a Child");
        }
        else if(age <= 20){
            System.out.println("You are a Teen.");
        }
        else if(age <= 60){
            System.out.println("You are a Adult.");
        }
        else{
            System.out.println("You are a Senior.");
        }
    }
}
