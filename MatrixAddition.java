import java.util.Scanner;

public class MatrixAddition {
    public static void main(String []args)
    {
        int a[][],b[][];
        int i,j,row,col; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows of matrix:");
        row=sc.nextInt();
        System.out.println("Enter number of columns of matrix:");
        col=sc.nextInt();
        a=new int[row][col];
        b=new int[row][col];
        System.out.println("Enter 1st array elements:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd array elements:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of Matrix:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(a[i][j]+b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
