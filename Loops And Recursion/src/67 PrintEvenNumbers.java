import java.util.Scanner;

class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n ;i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);

        }

    }
}
