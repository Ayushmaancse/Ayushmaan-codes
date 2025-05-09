import java.io.File;
import java.io.IOException;

public class E {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt"); // define the file

            boolean isFileCreated = file.createNewFile(); // returns true if created

            if (isFileCreated) {
                System.out.println("✅ File was created successfully.");
            } else {
                System.out.println("⚠️ File already exists.");
            }

        } catch (IOException e) {
            System.out.println("❌ An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
