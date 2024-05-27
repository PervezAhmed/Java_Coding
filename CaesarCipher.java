import java.util.Scanner;

public class CaesarCipher{
    public static void main(String[] args) {
        String str;
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.println("---ENCRYPTION---\n");
        System.out.println("Enter Plain Text :");
        str=sc.nextLine();
        System.out.println("Enter the value by which each letter of the string is to be shifted : ");
        key=sc.nextInt();
        char pt[] = str.toCharArray();
        char ct[]=new char[pt.length];
        // int i = pt[0]-'A';
        // ct[0]=(char)(i+'A');
        // System.out.println(ct[0]);
        for(int i=0;i<pt.length;i++){
            if(Character.isLetter(pt[i])){
                if(Character.isUpperCase(pt[i]))
                    ct[i] = (char)(((pt[i]-'A'+key)%26)+'A');
                else if(Character.isLowerCase(pt[i]))
                    ct[i] = (char)(((pt[i]-'a'+key)%26)+'a');
            }
            else if(pt[i]==' ')
                ct[i] = pt[i];
        }
        System.out.println("Cipher Text : ");
        for(int i=0;i<ct.length;i++)
            System.out.print(ct[i]);
        System.out.println("\n\n");

        System.out.println("---DECRYPTION---\n");
        
        for(key=0;key<26;key++){
            String decrypt="";
            for(int i=0;i<ct.length;i++){
                if(Character.isLetter(ct[i])){
                    if(Character.isUpperCase(ct[i]))
                        decrypt = decrypt + (char)(((ct[i]-'A'-key+26)%26)+'A');
                    else if(Character.isLowerCase(ct[i]))
                    decrypt = decrypt +(char)(((ct[i]-'a'-key+26)%26)+'a');
                }
                else if(ct[i]==' ')
                    decrypt = decrypt + ct[i];
            }
            System.out.println("For Key "+key+" : "+decrypt);
            System.out.println();
        }
        
    }
}