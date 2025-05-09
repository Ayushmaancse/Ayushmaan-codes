import java.io.File;
import java.io.IOException;

public class F{
    public static void main(String[] args) {
        try {
            // Create a File object with the file name
            File myFile = new File("myfile.txt");

            // Try to create the file
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // prints the error details
        }
    }
}
