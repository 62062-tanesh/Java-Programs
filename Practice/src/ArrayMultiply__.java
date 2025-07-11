import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMultiply__ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short T = sc.nextShort();
        ArrayList<Short> cal = new ArrayList<Short>();
        while(T>0){
            short N =sc.nextShort();
            for(int i=0;i<N;i++){
                short ele = sc.nextShort();
                cal.add(ele);
            }
            T--;
        }
        long mul = 1;
        for(short i =0;i<(short)(cal.size());i++){
            mul *= cal.get(i);
        }
        System.out.println(mul);
    }
}
