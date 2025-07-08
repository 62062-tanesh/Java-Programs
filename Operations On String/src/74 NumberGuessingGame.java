import java.util.Scanner;

class NumberGuessingGame {
    public int GetANumber(){
        int n = (int)(Math.random()*3);
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game: ");
        System.out.println("You Have Only Two Chances.");
//        System.out.print("Enter How Many Times You want to Play: ");
//        int k = sc.nextInt();
        System.out.println("Hint: The Number is Between 0 to 2");
        NumberGuessingGame n1 = new NumberGuessingGame();
        int guess = n1.GetANumber();
        int flag = 0;
        for(int i=1;i<3;i++){
            System.out.print("Enter The Number: ");
            int n = sc.nextInt();
            if(n == guess){
                System.out.println("\t\t\t\tYou Won."+"\n\t\t\tThe Number is "+guess);
                flag ++;
                break;
            }
            else{
                System.out.println("Try Again.");
            }
        }
        if(flag == 0){
            System.out.println("\t\t\t!!Better Luck Next Time!!");
        }
    }
}
