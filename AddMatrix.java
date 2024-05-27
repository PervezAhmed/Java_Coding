import java.util.Scanner;

public class AddMatrix 
{
    public static void main(String[] args)
    {
        int a[][],b[][];
        int i,j,size; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of both arrays:");
        size=sc.nextInt();
        a=new int[size][size];
        b=new int[size][size];
        System.out.println("Enter 1st array elements:");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd array elements:");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of Matrix is:");
        System.out.println("Enter 1st array elements:");
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
            {
                System.out.print((a[i][j]+b[i][j])+"\t");
            }
            System.out.println();
        }
    }
    
}
