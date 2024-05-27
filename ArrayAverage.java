import java.util.Scanner;

public class ArrayAverage {
    public static void main(String pervez[])
    {
        int a[][],i,j,row,col,sum=0;
        float avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows of the matrix:");
        row=sc.nextInt();
        System.out.println("Enter number of columns of the matrix:");
        col=sc.nextInt();
        a=new int[row][col];
        System.out.println("Enter elements of the matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                sum+=a[i][j];
            }
        }
        avg=(float)sum/(row*col);
        System.out.println("Sum= "+sum+"\t"+"Average= "+avg);;
    }
}
