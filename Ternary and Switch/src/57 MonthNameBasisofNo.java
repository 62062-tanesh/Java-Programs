import java.util.Scanner;

class MonthNameBasisofNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        String result = getMonthName(n);
        System.out.println("The Month Name is: " + result);
    }

    public static String getMonthName(int n) {
        return switch (n) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Wrong Input";
        };
    }
}
