import java.util.*;
import java.util.Arrays.*;
class RepeatedAndMissing {
	public static void repeatedandmissing(int[] arr)
	{
		int index=-1;
		//First i will try to find the Repeated Number
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1])
			{

				System.out.println("Here ur Repeated Number is " + arr[i]);
				continue;
			}

		}
	//Now i will try to find the Missing Number
		for(int i=0; i<arr.length; i++)
		{
		if(arr[i+1]-arr[i]>1)
		{
			index=i+1;
			break;
		}
			
		}
		System.out.println("Here ur Missing Number is "  + index);
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
	
	repeatedandmissing(arr);
}
}
