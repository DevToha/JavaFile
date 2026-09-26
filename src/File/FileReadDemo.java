package File;

import java.io.File;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {

        try {

            File file = new File("/Users/tohakhan/Library/Mobile Documents/com~apple~CloudDocs/Documents/Java file/Person/student.txt");
            Scanner scanner =  new Scanner(file);

            while (scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID: "+id +"Name: "+name);
            }

            scanner.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
