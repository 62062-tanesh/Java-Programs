import java.util.Scanner;

class PrimeNoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        boolean result = primecheck(n);
        if(result){
            System.out.println("Number is Prime.");
        }
        else{
            System.out.println("Numeber is Not Prime.");
        }
    }
    public static boolean primecheck(int n){
        int i=2;
        while(i<n){
            if(n%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
