import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwa_advanced2_filehandling {
    public static void main(String[] args) {
        // create a file
     /*   File Myfile=new File("Cwa.txt");
        try {
            Myfile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

      */
        // write a new file
    /*    try {
            FileWriter fileWriter=new FileWriter("Cwa.txt");
            fileWriter.write("this is our first file from java course");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

     */
     // Reading a file
     /*   File Myfile=new File("Cwa.txt");
        try {
            Scanner sc=new Scanner(Myfile);
            while(sc.hasNextLine()){
                String line= sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

      */
        // Deleting a file
        File Myfile=new File("Cwa.txt");
        if(Myfile.delete()){
            System.out.println("i have deleted" +Myfile.getName());
        }
        else{
            System.out.println("Some error occured while deleting the file");
        }

    }
}
