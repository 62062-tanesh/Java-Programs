/* Question:

Write a Preogram to Add the Perfect Numbers Digit between two Numbers
EXAMPLE:
    1 to 500 = 6,28,496
    Addition Of The Digit is: 6+2+8+4+9+6 = 35

*/

import java.util.Scanner;

class Perfect_Number_Passwords {

    public static boolean isPerfect(int n){
        int fact = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                fact += i;
            }
        }
        if(fact == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum+r;
            n = n/10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Two Numbers between you want to check the perfect Numbers");
        System.out.print("Enter The First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int n2 = sc.nextInt();
        int sum = 0;
        for(int i=n1;i<n2;i++){
            if(isPerfect(i)){
                sum = sum+sumOfDigit(i);
            }
        }
        System.out.println("The Sum of Digit Of Password between "+n1+" to "+n2+" is: "+sum);
    }
}
