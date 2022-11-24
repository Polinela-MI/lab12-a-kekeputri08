import java.io.*;

public class FileExcercise2 {
    public static void main(String[] args){
        readInputBuff();
    }

    public static void readInputBuff(){
       File file = new File("docs/newfile.txt");

       try {
           FileReader reader = new FileReader(file);
           BufferedReader buffRead = new BufferedReader(reader);
            String line;


           while((line = buffRead.readLine()) !=null){
               System.out.println(line);
           }

    } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
    }