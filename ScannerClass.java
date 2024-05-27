import java.util.Scanner; 

public class ScannerClass {
    public static void main(String args[])
    {
        String c;                                            //char c;-----------
        Scanner s=new Scanner(System.in);                    //                 |
        System.out.println("Enter a word or charcter:");     //                 |
        c=s.next();                                   //s.next().charAt(0);  <--|
        System.out.println("Entered character or word is : "+c);
        s.close();
    }
}

// nextLine() method is used to read more than one word 