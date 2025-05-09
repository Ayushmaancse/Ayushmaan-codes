import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class H {
    public static void main(String[] args) {
        // Step 1: Define file name (no folder)
        String fileName = "info.txt";

        // Step 2: Create file object in current directory
        File file = new File(fileName);

        try {
            // Step 3: Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());

                // Step 4: Write some content to the file
                FileWriter writer = new FileWriter(file);
                writer.write("Name: John Doe\n");
                writer.write("Email: john.doe@example.com\n");
                writer.write("This file was created without a folder.\n");
                writer.close();

                System.out.println("File writing completed.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
