import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingOutput {
    public static void main(String[] args) {
        writeOutput();
    }

    public static void writeOutput() {
        File file = new File("output.txt");

        try {
            PrintWriter writer = new PrintWriter(file);
            writer.write("Java Is My Favorite.\n");
            writer.write("Saya Suka belajar Java");

            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
