public class TestRun {
    public static void main(String[] args) {
        for(Day r : Day.values()){
            System.out.println(r);
        }
        System.out.println();
        System.out.println("Printing All The Days of The Week");
        for(Day r : Day.values()){
            System.out.println(r+": "+r.getType());
        }
    }
}
