import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
public class WriteBufferedFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fo = new FileOutputStream("Outputfile.txt");

        BufferedOutputStream bo = new BufferedOutputStream(fo);

        byte b = 126;
        try {
            bo.write(b);
            System.out.println("Byte escrito corretamente");
            bo.close();
            fo.close();     
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
