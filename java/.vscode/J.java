
import java.io.FileWriter;
import java.io.IOException;


public class J{
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("myfile.txt");
            writer.write("hello this a simple example ./learning file handlig in java");
            writer.close();
            System.out.println(" successfuly wrote to the file");

        } catch (IOException e) {
            System.out.println("an aerror occured");
            e.printStackTrace();
        }
    }
}


