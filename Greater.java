import java.util.Scanner;

public class Greater
{
    public static void main(String[] args)
    {

        int a,b;
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.println(a+" is greater");
        else
            System.out.println(b+" is greater");
        sc.close();
    }
} 