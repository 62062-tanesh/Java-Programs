import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "Raj@123";
        String i;
        do{
            System.out.print("Enter The Password: ");
            i = sc.nextLine();
        }while(!i.equals(pass));
        System.out.println("Correct Password.");
    }
}
