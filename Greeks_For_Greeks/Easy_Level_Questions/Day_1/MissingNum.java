// Input: arr[] = [1, 2, 3, 5]
// Output: 4
// Explanation: All the numbers from 1 to 5 are present except 4.
//Code Start From Here  
import java.util.*;
import java.util.Arrays;
class Missing {
	public static int missinNum(int[] arr)
	{

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i+1]-arr[i]>1)
			{
				return arr[i]+1;
			}
		}
		return -1;
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
		int result=missinNum(arr);
		System.out.println(result);
	}
	
}
