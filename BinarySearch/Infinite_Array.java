	// int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
	// 	int target=10;
//Ouput Should be :- 4


class InfiniteArray{
	
	//This is the another Function
	static int ans(int[] arr, int target)
	{
		int start=0;
		int end=1;
	
	//This is the condition to find the Binary search where the target is lies.
	while(target>arr[end])
	{
	int temp=end+1;
		//This is the formula
		end=end+(end-start+1)*2;
		start=temp;
	}
	return binarysearch(arr,target,start,end);
	}
	//This is the function to find the Binary Search
	//But u have to not use the start=0 and end=0 and arr.length
	//To find the exacet value
	public static int binarysearch(int[]arr, int target,int start, int end)
	{
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
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int target=10;
		 InfiniteArray ia= new  InfiniteArray();
		int result=ia.ans(arr,target);
		System.out.println(result);
	}
}
