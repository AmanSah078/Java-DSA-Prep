import java.util.*;
import java.util.Arrays.*;
class  MissingNum {
	public static void  missing(int[] arr)
	{
		int index=0;
		for(int i=0; i<arr.length-1; i++)
		{
		
			if(arr[i]!=i+1)
			{
				index=i+1;
				break;
			}
	}
		System.out.println("Missing Number is   " + index);
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
		Arrays.sort(arr);
		missing(arr);	
	}
}
