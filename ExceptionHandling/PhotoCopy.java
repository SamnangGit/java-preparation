import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class PhotoCopy {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream(
                    "source destination");
            FileOutputStream os = new FileOutputStream(
                    "output destination");
            byte[] buffer = new byte[1024];
            int data;
            while ((data = is.read(buffer)) > 0) {
                os.write(buffer, 0, data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file in system");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Reach here");
    }
}
