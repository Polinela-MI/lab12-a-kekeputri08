import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExcercise {
    public static void main(String[] args){
        readInputScanner();
    }

    public static void readInputScanner(){
        File file = new File("docs/newfile.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()){
                String a = scanner.nextLine();
                System.out.println(a);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException();
        }

    }
}