import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The File Name: ");
        String fileName = sc.nextLine();
        try(FileReader Reading = new FileReader(fileName)){
            int file = 0;
            do{
                file = Reading.read();
                System.out.print((char)file);
            }while(file != -1);

        } catch(FileNotFoundException e){
            System.out.println("FileName is Not Found: "+e.getMessage());
        }
        catch (IOException e1){
            System.out.println(e1.getMessage());
        }

    }
}
