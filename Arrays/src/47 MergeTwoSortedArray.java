import java.util.Scanner;

class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Sorted Array Strictly.");
        int [] arr1 = ArrayUtility.ArrayIntput();
        System.out.println("Enter Second Sorted Array Strictly.");
        int [] arr2 = ArrayUtility.ArrayIntput();
        int [] result = mergedArray(arr1,arr2);
        ArrayUtility.Display(result);
    }
    public static int [] mergedArray(int [] a1, int[] a2){
        int NewSize = a1.length + a2.length;
        int [] ans = new int [NewSize];
        int i = 0, j = 0, k = 0;
        while(i<a1.length || j<a2.length){
            if(j == a2.length || (i < a1.length && a1[i]<a2[j])){
                ans[k] = a1[i];
                i++;
                k++;
            }else{
                ans[k] = a2[j];
                j++;
                k++;
            }
        }
        return ans;
    }
}
