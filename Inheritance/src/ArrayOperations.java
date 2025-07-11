import java.util.Arrays;

public class ArrayOperations {
    int [] arr;
    ArrayOperations(int [] arr){
        this.arr = arr;
    }

    private class statistics{
        double mean(){
            double sum = 0;
            for(int ele : arr){
                sum += ele;
            }
            return sum/arr.length;
        }
        int median(int n){
            return n;
        }
    }

    public static void main(String[] args) {
        int [] a = {3,2,3,4};
        ArrayOperations new1 = new ArrayOperations(a);
        ArrayOperations.statistics statictic = new1.new statistics();
        System.out.println(statictic.mean());

    }
}
