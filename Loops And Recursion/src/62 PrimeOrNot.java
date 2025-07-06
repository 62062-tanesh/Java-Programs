import java.util.Scanner;

class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        boolean result = isprime(n);
        if(result){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is Not Prime");
        }
    }
    public static boolean isprime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
            }
        return true;
        }
    }

