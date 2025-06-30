import java.util.Scanner;

class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int n2 = sc.nextInt();
        System.out.println("GCD of The Numbers are: "+gcd(n1,n2));
    }
    public static int gcd(int n1,int n2){
        int result = 1;
        int i = 2;
        int least = min(n1,n2);
        while(i<=least){
            if(n1%i ==0 && n2%i == 0){
                result = i;
            }
            i++;
        }
        return result;
    }
    public static int min(int n1, int n2){
        if(n1<n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}
