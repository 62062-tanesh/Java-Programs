import java.util.Scanner;

class UseOfBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i>-1; i++){
            System.out.println("Note : If you want to Exit write \"Exit\"");
            System.out.print("Enter SomeThing: ");
            String stop = sc.nextLine();
            if(stop.equals("Exit")){
                break;
            }
        }
        System.out.println("Successfully Exit");
    }
}
