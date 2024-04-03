import java.io.FileReader;
import java.io.IOException;

public class CountCharInAFile {
    public static void main(String[] args) {
        // Path to the file
        String filePath = "C:/Users/LENOVO/Desktop/VS_Workspace/My_GitHub/2nd-Sem_Lab_work/week_10/docs.txt";

        try {
            // Create a FileReader object to read the file
            FileReader fileReader = new FileReader(filePath);

            int character = -1; 
            int charCount = 0;

            // Read each character from the file and count them
            while ((character = fileReader.read()) != -1) {
                charCount++;
            }

            // Close the file reader
            fileReader.close();

            // Output the number of characters
            System.out.println("Number of characters in the file: " + charCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
