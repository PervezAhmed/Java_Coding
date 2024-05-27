import java.util.Scanner;

public class AlphabeticalOrder
{
    public static void main(String a[])
    {
        String names[]=new String[5];
        String temp;
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 names:");
        for(i=0;i<5;i++)
        {
            names[i]=s.nextLine();
        }
        for(i=0;i<5-1;i++)
        {
            for(j=0;j<5-i-1;j++)
            {
                if(names[j].compareTo(names[j+1])>0)
                {
                    temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;
                }
            }
        }
        System.out.println("Names in Alphabetical Order:");
        for(i=0;i<5;i++)
        {
            System.out.println(names[i]);
        }
        s.close();
    }
} 