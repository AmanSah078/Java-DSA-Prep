class Search_In_Rotated_Sorted_Array {
//This is Method i just create just because to know the pivot==target or not
static int tocheck(int[] arr, int target)
{
	int pivot=tofindthepivot(arr);
//when u did not find the pivot,it means array is not rotated
	if(pivot==-1)
	{
		return normalBinarySearch(arr,target,0,arr.length-1);
	}
	
//If the pivot will be available
	if(arr[pivot]==target)
	{
		return pivot;
	}
	if(target>=arr[0])
	{
		return normalBinarySearch(arr,target,0,pivot-1);
	}
	return normalBinarySearch(arr,target,pivot+1, arr.length-1);
}
	
	
	
	//This is the method for the 4 cases
	static int tofindthepivot(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid =start+(end-start)/2;
//This is the First Case			
			if(arr[mid]>end && arr[mid]>arr[mid+1])
			{
				return mid;
				
			}
//This is the Second Case
			if(arr[mid]>start && arr[mid]<arr[mid-1])
			{
				return mid-1;
			}
//This is the Third Case			
			if(arr[mid]<=arr[start])
			{
				end=mid-1;
			}
//This is the Fourth Case			
			else {
				return arr[mid];
			}
		}
		return -1;
	}
//This is the function where i can create the Normal Binary Search
static int normalBinarySearch(int[] arr, int target,int start, int end)
{

	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(arr[mid]>target)
		{
			end=mid-1;
		}
		else if(arr[mid]<target)
		{
			start=mid+1;
		}
		else {
			return mid;
		}
	}
	return -1;
}
	public static void main(String[] args)
	{
		int[] arr={4,5,6,7,0,1,2};
		int target=0;
		Search_In_Rotated_Sorted_Array sear=new Search_In_Rotated_Sorted_Array();
		System.out.println(sear.tocheck(arr,target));
	}
	
}
