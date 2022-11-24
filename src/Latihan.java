

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args){
        calculator();
    }

    public static void calculator(){
        File input = new File("docs/newfile.txt");
        File output = new File("docs/out.txt");

        try {
            Scanner scanner = new Scanner(input);
            PrintWriter writer = new PrintWriter(output);

            while (scanner.hasNextInt()){
                String[] hasilSplit = scanner.nextLine().split(" ");

                int result = 0;
                for(int i=0; i < hasilSplit.length; i++){
                    result += Integer.parseInt(hasilSplit[i]);
                }
                writer.write(hasilSplit[0] + " + "  + hasilSplit[1] + " = " + result);
                writer.write("\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

