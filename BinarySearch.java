import java.util.Scanner;


public class BinarySearch {
    public static void main(String args[])
    {
        int a[];
        int i,size,key,flag=0,first,last,mid;
        System.out.println("Enter size of the array:");
        Scanner s= new Scanner(System.in);
        size=s.nextInt();
        a=new int[size];
        System.out.println("Enter elements of the array in a sorted fashion:");
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter element to be searched:");
        key=s.nextInt();
        first=0;
        last=size-1;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(a[mid]==key){
                flag=1;
                break;
            }
            else if(a[mid]>key)
                last=mid-1;
            else
                first=mid+1;
        }
        if(flag==1)
            System.out.println("Element Found in the array");
        else
            System.out.println("Element Not Found in the array");
        s.close();
    }    
}
