import java.util.Scanner;

class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();
        printTable(n);
    }
    public static void printTable(int n){
        for(int i=1;i<11;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
