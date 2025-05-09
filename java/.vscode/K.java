import java.io.File;
import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            Scanner reader = new Scanner(myFile);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
