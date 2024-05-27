// Java program of above implementation
public class NegativeOneSide {

	public static void main(String args[]) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int low=0,temp; 
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]<0)
		    {
		        temp=arr[i];
		        arr[i]=arr[low];
		        arr[low]=temp;
		        low++;
		    }
		}
		for(int i=0;i<arr.length;i++)
		    System.out.println(arr[i]);
	}

}
