import java.io.FileWriter;
import java.io.IOException;

public class cwa_advanced2_practice {
    public static void main(String[] args) {
        int i=2;
        String table="";
        for (int j=0;j<=10;j++){
            table+=i + "X" +(j+1)+ "=" +i*(j+1);
            table+="\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("Multiplication.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
