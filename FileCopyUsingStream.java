import java.io.FileInputStream;
import java.io.FileOutputStream;
/*import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;*/
import java.io.IOException;

public class FileCopyUsingStream {
    public static void main(String args[]) throws IOException
    {   int c;
        byte b[]={65,70,75,80,85};
        int a=97;
        FileInputStream fin= new FileInputStream("D:\\Documents\\introduce.txt");
        FileOutputStream fout= new FileOutputStream("D:\\Documents\\introduce_copy.txt");
        while((c=fin.read())!=-1)
            fout.write((char)c);
        fout.write(b);
        fout.write(a);
        fin.close();
        fout.close();
    }
}
