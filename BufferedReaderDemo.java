import java.io.*;
class BufferedReaderDemo  {
public static void main(String[] args) throws IOException  {
BufferedReader br = new BufferedReader(
                      new InputStreamReader (System.in));
System.out.println("Enter first number: ");
String s1 = br.readLine();
int fno = Integer.parseInt(s1);
System.out.println("Enter second number: ");
int sno = Integer.parseInt(br.readLine());
System.out.println("Result : "+(fno+sno));
}
}
