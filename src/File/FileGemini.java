package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileGemini {
    public static void main(String[] args) throws IOException {

        File fileTest = new File("data.txt");

        try {
            fileTest.createNewFile();

            System.out.println("File created successfully");
        } catch (Exception e){
            System.out.println(e);
        };

//        file write

        try {
            FileWriter fileWriter = new FileWriter("data.txt");

            fileWriter.write("Java Programming Language\n");
//            fileWriter.write("Is this working perfectly");

            fileWriter.close();

        } catch (Exception e) {
            System.out.println(e);
        }
         //file read
        try {

//            File fileTest = new File("data.txt");

            Scanner scanFile = new Scanner(fileTest);

            while (scanFile.hasNext()){
                String name = scanFile.nextLine();
                System.out.println("File Scan successfull, The text is: "+name);
            }

        }catch (Exception e){
            System.out.println(e);
        };

    };

}
