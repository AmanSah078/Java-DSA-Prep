//we can also called Dutch National Flag Approach
import java.util.*;
class  {
	public static void setcolors(int[] nums)
	{
		int start=0;
		int mid=0;
		int end=nums.length-1;
		
				while(mid<=end)
			
		{
		//It is execute the nums case based on the mid
		switch(nums[mid])
		{
	
			case 0:
			swap(nums,start,mid);
			start++;
			mid++;
			break;
			
			case 1:
			mid++;
			break;
			
			case 2:
			swap(nums,mid,end);
			end--;
			break;
		}
	}
}
	
	//Need of Swap
static void swap(int[] arr,int i, int j)
	{
		int temp=arr[i];
	    arr[i]=arr[j];
	arr[j]=temp;
}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
for(int i=0; i<nums.length; i++)
{
	nums[i]=sc.nextInt();
}
	setcolors(nums);
	System.out.println(Arrays.toString(nums));
	}
}
