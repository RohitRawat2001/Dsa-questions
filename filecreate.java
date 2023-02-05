import java.io.File;
import java.io.IOException;

public class filecreate {
    public static void main(String[] args) {
        File myfile=new File("myfile.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("unable");
            e.printStackTrace();
        }
    }
    
}
