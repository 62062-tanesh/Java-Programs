import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.println("The Number is between 1 to 6");
        int i = 3;
        int n;
        do{
            System.out.print("Guess The Number: ");
            n = sc.nextInt();
        }while(i != n);
        System.out.println("Correct Number");
    }
}
