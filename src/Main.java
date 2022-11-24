import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator() {

        Scanner keke = new Scanner(System.in);

        File input = new File("docs/newfile.txt");
        File txt = new File("docs/out.txt");
        File csv = new File("docs/output.csv");

        System.out.println("Membaca input " + input);
        System.out.println("Pilih tipe file output yang diinginkan :");
        System.out.println("1. Text File");
        System.out.println("2. CSV File");
        System.out.println("-------------------");
        System.out.println("Masukkan Pilihan : ");

        int choose = keke.nextInt();

        if(choose==1){
            try {
                Scanner scanner = new Scanner(input);
                PrintWriter writer = new PrintWriter(txt);

                writer.write( " a "  +   " b " + "a+b");
                writer.write("\n");

                while (scanner.hasNextInt()){

                    String[] hasilSplit = scanner.nextLine().split(" ");

                    int result = 0;
                    for(int i=0; i < hasilSplit.length; i++){
                        result += Integer.parseInt(hasilSplit[i]);
                    }
                    writer.write(hasilSplit[0] + " + "  + hasilSplit[1] + " = " + result);
                    writer.write("\n");
                }
                System.out.println(txt + " berhasil dibuat");
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }else if (choose==2){
            try {
                Scanner scanner = new Scanner(input);
                PrintWriter writer = new PrintWriter(csv);

                writer.write( "a,"  +   "b," + "a+b");
                writer.write("\n");

                while (scanner.hasNextInt()){

                    String[] hasilSplit = scanner.nextLine().split(" ");

                    int result = 0;
                    for(int i=0; i < hasilSplit.length; i++){
                        result += Integer.parseInt(hasilSplit[i]);
                    }
                    writer.write(hasilSplit[0] + ","  + hasilSplit[1] + "," + result);
                    writer.write("\n");
                }
                System.out.println(csv + " berhasil dibuat");
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}

