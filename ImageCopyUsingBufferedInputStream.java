import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
/*import java.io.File;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;*/
import java.io.IOException;

public class ImageCopyUsingBufferedInputStream {
    public static void main(String args[]) throws IOException
    {   int c;
        FileInputStream fin= new FileInputStream("D:\\Photos\\New folder\\WIN_20211031_11_53_21_Pro (2).jpg");
        BufferedInputStream br= new BufferedInputStream(fin);
        FileOutputStream fout= new FileOutputStream("D:\\Photos\\New folder\\CopiedPhotoBuffered.jpg");
        BufferedOutputStream bw=new BufferedOutputStream(fout);
        while((c=br.read())!=-1)
            bw.write((char)c); //br.write(c);
        bw.close();
        fout.close();
        br.close();
        fin.close();
    }
}