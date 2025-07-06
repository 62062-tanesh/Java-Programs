import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Score Of The Student: ");
        int marks = sc.nextInt();
        String Category = marks >= 80 ? "High" : (marks >= 50 ? "Moderator" : "Low");
        System.out.println("The Student Grade is : "+Category);
    }
}
