import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String []args)
    {
        int a[][],b[][],r[][];
        int i,j,k,row1,col1,row2,col2; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns of 1st Matrix:");
        row1=sc.nextInt();
        col1=sc.nextInt();
        System.out.println("Enter number of rows and columns of 2nd Matrix:");
        row2=sc.nextInt();
        col2=sc.nextInt();
        a=new int[row1][col1];
        b=new int[row2][col2];
        r=new int[row1][col2];
        if(col1==row2)
        {
            System.out.println("Enter 1st array elements:");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter 2nd array elements:");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    r[i][j]=0;
                    for(k=0;k<col1;k++)
                    {
                        r[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Multiplication of Matrix:");   
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                   System.out.print(r[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Multiplication not possible");
        }       
    }
}
