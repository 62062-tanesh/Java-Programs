import java.util.Scanner;

public class AirthmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int b = sc.nextInt();
        try{
            int result = a/b;
            System.out.printf("Result is: %d", result);
        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("Division is Not Possible with 0.");
            }else{
                throw exception;
            }
        }
    }
}
