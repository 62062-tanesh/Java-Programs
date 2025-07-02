import java.util.Scanner;

class PalindromeCheckInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayUtility.ArrayIntput();
        boolean result = checkPalindrome(arr);
        if(result){
            System.out.println("Array is Palindrome.");
        }
        else{
            System.out.println("Array is Not Palindrome.");
        }

    }
    public static boolean checkPalindrome(int []a ){
        int size = a.length;
        int i = 0;
        while(i<size/2){
            if(a[i] == a[(size-1)-i]){
                return true;
            }
            i++;
        }
        return false;
    }
}
