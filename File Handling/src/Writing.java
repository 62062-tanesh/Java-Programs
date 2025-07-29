import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        String filename = "My Notes.txt";
        try(FileWriter writer = new FileWriter(filename)){
            writer.write("Hey, Whatsup");
            System.out.println();
            writer.flush();
            System.out.println("File Written Successfully.");
        } catch (IOException e){
            System.out.println("Exception Occured "+ e.getMessage());
        }
    }
}
