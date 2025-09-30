//Just common sense dude just thhink 1st it will be go where? 1st check in ur array the target is avaialbe or not if not then check the condition where our target is satsify 
import java.util.*;
class CellingElement {
	public static int celling_Ele(int[] arr, int target)
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
		return arr[start];
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
		int result=celling_Ele(arr,target);
		System.out.println(result);
	}
}
