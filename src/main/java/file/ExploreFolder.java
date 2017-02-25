package file;

import java.io.File;
import java.io.IOException;

/**
 * Created by Adrian on 25/02/2017.
 */
public class ExploreFolder {

    public static void main (String [ ] args) throws IOException {
        File[] files = new File("D:\\Descargas\\VA – Brit Awards 2017 (2017) 320").listFiles();
        for (File file : files) {
            if (Character.isDigit(file.getName().charAt(0)) || file.getName().charAt(0) == '.' || file.getName().charAt(0) == ' '){
                File oldfile =new File(file.getPath());
                File newfile =new File(file.getPath().replace(file.getName(),file.getName().substring(1, file.getName().length())));
                if(oldfile.renameTo(newfile)){
                    System.out.println("File renamed");
                }
            }
        }
    }
}
