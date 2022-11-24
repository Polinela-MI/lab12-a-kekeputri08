import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Excercise {
    public static void main(String[] args){
        String folderbaru = "C:/Users/LENOVO/Downloads/latihan PBO/latihan";
        String filebaru = "newfile.txt";

        File file1 = new File(folderbaru);
        File file2 = new File(file1, filebaru);


        try {
            file1.mkdir();
            file2.createNewFile();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}