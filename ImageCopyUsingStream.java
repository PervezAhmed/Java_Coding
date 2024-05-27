import java.io.FileInputStream;
import java.io.FileOutputStream;
/*import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;*/
import java.io.IOException;

public class ImageCopyUsingStream {
    public static void main(String args[]) throws IOException
    {   int c;
        FileInputStream fin= new FileInputStream("D:\\Photos\\New folder\\WIN_20211031_11_53_21_Pro (2).jpg");
        FileOutputStream fout= new FileOutputStream("D:\\Photos\\New folder\\CopiedPhoto.jpg");
        while((c=fin.read())!=-1)
            fout.write((char)c);//fout.write(c);
        fin.close();
        fout.close();
    }
}
