//2 3 5 9 14 16 18
//If i took the target element is 15 then we get the ouput 14 because The Element Should be less than 15 but greater than from the all the elements
import java.util.*;
class Floor {
	public static int Floor_Elem(int[] arr, int target)
	{
		//		“What happens if the target is greater than all the elements in the array, and what happens if the target is smaller than all the elements in the array?”
		
		if(target>arr[arr.length-1] || target<arr[arr.length-1])
		{
			return -1;
		}
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target>arr[mid])
			{
			start=mid+1;	
			}
			
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				return arr[mid];
			}
			
		}
		
//		System.out.println(arr[mid]);
		return arr[end];
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
		int target=sc.nextInt();
		int result= Floor_Elem(arr,target);
		System.out.println(result);
	}
}
