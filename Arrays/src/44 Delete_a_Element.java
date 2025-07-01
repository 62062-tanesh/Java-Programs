import java.util.Scanner;

class Delete_a_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] a = ArrayUtility.ArrayIntput();
        ArrayUtility.Display(a);
        System.out.print("Enter The Number You want to Delete: ");
        int n = sc.nextInt();
        int [] arr = DeletedElement(a,n);
        ArrayUtility.Display(arr);
    }
    public static int [] DeletedElement(int [] a,int n){
        if(occ(a,n)==0){
            return a;
        }
        int NewSize = a.length - occ(a,n);
        int [] arr = new int [NewSize];
        int i=0;
        int j=0;
        while(i<a.length){
            if(a[i]!=n) {
                arr[j] = a[i];
                j++;
            }
            i++;
        }
        return arr;
    }
    public static int occ(int [] a, int n){
        int flag = 0;
        int i = 0;
        while(i<a.length){
            if(n == a[i]){
                flag++;
            }
            i++;
        }
        return flag;
    }


}
