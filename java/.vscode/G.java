import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class G {
    public static void main(String[] args) {
        // Step 1: Define directory and file name
        String folderPath = "mydata";
        String fileName = "info.txt";

        // Step 2: Create directory object
        File folder = new File(folderPath);

        // Step 3: Create directory if it doesn't exist
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Folder created: " + folderPath);
            } else {
                System.out.println("Failed to create folder.");
                return;
            }
        }

        // Step 4: Create file object in that folder
        File file = new File(folderPath + File.separator + fileName);

        try {
            // Step 5: Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());

                // Step 6: Write some content to the file
                FileWriter writer = new FileWriter(file);
                writer.write("Name: John Doe\n");
                writer.write("Email: john.doe@example.com\n");
                writer.write("Java file creation example with folder.\n");
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
