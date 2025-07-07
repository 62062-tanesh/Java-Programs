import java.util.Scanner;

class UseOfContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many Number you want to add: ");
        int n = sc.nextInt();
        int [] a = new int [n];
        System.out.println("Enter The Elements");
        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i: a){
            if(i<0){
                continue;
            }
            sum += i;
        }
        System.out.println("The Addition Of The Positive Integers are: "+sum);

    }
}
