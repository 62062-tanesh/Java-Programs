import java.util.Scanner;

public class MultiplyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        int [][] arr = new int[T][N];
        for(int i =0;i<T;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int mul  = 1;
        for(int i =0;i<T;i++){
            for(int j=0;j<N;j++){
                mul *= arr[i][j];
            }
        }
        System.out.println(mul);
    }
}
