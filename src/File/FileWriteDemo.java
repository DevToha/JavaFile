package File;

import java.util.Formatter;
import java.util.Scanner;

public class FileWriteDemo {
    public static void main(String[] args){

        String  id,name;

        try {

            Formatter formatter = new Formatter("/Users/tohakhan/Library/Mobile Documents/com~apple~CloudDocs/Documents/Java file/Person/student.txt");

            Scanner input = new Scanner(System.in);
            System.out.println("How many student you want to take: ");
            int num = input.nextInt();

            for(int i = 1; i <= num; i++){
                System.out.println("Enter Student id and name: ");
                id = input.next();
                name = input.next();

                formatter.format("%s, %s\r\n",id,name);
            }

            formatter.format("%s, %s","101","Toha");

            formatter.close();

        }catch (Exception e){
            System.out.println(e);
        };
    }
}
