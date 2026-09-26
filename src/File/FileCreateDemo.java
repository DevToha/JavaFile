package File;

import java.io.File;

public class FileCreateDemo {
    public static void main(String[] args){

        File dir = new File("Person");
        dir.mkdir();

        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        System.out.println(dir.getName());
//        dir.delete();

        File file1 = new File("/Users/tohakhan/Library/Mobile Documents/com~apple~CloudDocs/Documents/Java file/Person/student.txt");
        File file2 = new File(dirLocation+"student1.txt");
        File file3 = new File("person.txt");

        try {

            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();

            System.out.println("All files are created Successfully");

        }catch (Exception e){
            System.out.println(e);

        };

        file2.delete();

        if(file2.exists()){
            System.out.println("File exists");
        }else {
            System.out.println("File does not exists");
        }
    }
}
