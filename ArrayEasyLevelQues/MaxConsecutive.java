
import java.util.*;
class MaxCons {
	public static void maxconsecutive(int[] arr)
	{
		int count=0;
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
			else {
				count=0;
			}
			if(count>max)
			{
				max=count;
			}
		}
		System.out.println("The Max Consecutive will be " + max);
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
		maxconsecutive(arr);
	}
}
