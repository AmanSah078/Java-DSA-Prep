
import java.util.*;
class FirstOccurance{
	public static int m1(int[]arr, int idx, int x)
	{
		//Base
		if(idx==arr.length)
		{
			return -1;
		}
		//Compare 
		if(arr[idx]==x)
		{
			return idx;
		}
//If not equal then call the next index		
		else {
			int fissa= m1(arr,idx+1,x);
			return fissa;
		}
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

		int x=sc.nextInt();
		int result=m1(arr,0,x);
		System.out.println(result);
}
}
