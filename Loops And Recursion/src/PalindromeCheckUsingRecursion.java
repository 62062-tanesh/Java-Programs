import java.util.Scanner;

class PalindromeCheckUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Word For check it is Palindrome or Not: ");
        String str = sc.nextLine();
        System.out.println("Your String is "+(isPalindrome(str) ? "Palindrome" : "Not Palindrome"));

    }
    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() -1 ;
        if(str.charAt(0)!= str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}
