//Check Sorted or not Without using the Sorting
import java.util.*;
class Trial {
public static boolean sorted(int[] arr)
{
	for(int i=0; i<arr.length-1; i++)
	{
		if(arr[i]>arr[i+1])
		{
			return false;
		}
	
	}
	return true;
}
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean b1=sorted(arr);
    System.out.println(b1 ? "Array is sorted" : "Array is not sorted");
	}
}
