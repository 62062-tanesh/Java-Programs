import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = PalindromicSubstring(str);
        System.out.println();
        System.out.println("The Number Of Palindromic String is: "+ans);

    }
    public static boolean IsPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        boolean ans = true;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                ans = false;
            }
            i++;
            j--;
        }
        return ans;
    }
    public static int PalindromicSubstring(String str){
        int count = 0;
        for(int i=0;i<str.length(); i++){
            for(int j=i+1;j<=str.length();j++){
                if(IsPalindrome(str.substring(i,j))){
                    System.out.print(str.substring(i,j)+" ");
                    count ++;
                }
            }
        }
        return count;
    }
}
