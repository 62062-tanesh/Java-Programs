import java.util.Scanner;

public class Q19_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks Percentage: ");
        float marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Grade 'A'");
        }
        else if(marks >= 75){
            System.out.println("Grade 'B'");
        }
        else if(marks >= 60){
            System.out.println("Grade 'C'");
        }
        else if(marks >= 30){
            System.out.println("Grade 'D'");
        }
        else{
            System.out.println("Fail");
        }
    }
}
