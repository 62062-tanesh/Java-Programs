import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolderName;
    float balance = 0;

    BankAccount(long n, String name){
        this.accountNumber = n;
        this.accountHolderName = name;

    }
    public void Deposite(float d){
        balance+=d;
        System.out.println("Successfully Deposited.");
    }
    public void Withdraw(float w){
        if(w>balance){
            System.out.println("Insufficient Balance.");
            System.out.println("Your Current Balance is: "+balance);
        }else{
            balance-=w;
            System.out.println("Take your Money "+ w);
        }
    }
    public void showbalance(){
        System.out.println("Your Balance is: "+balance);
    }
}
class customer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount customer1 = new BankAccount(8546792124l,"Tanesh");
        customer1.showbalance();
    }
}


