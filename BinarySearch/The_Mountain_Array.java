class The_Mountain_Array
{
	//Now u have to call the funciton
	//This is for the 1st Half
	static int tofindPeakIndexMountain(int[]arr, int target)
	{
		int peak=peakElement(arr);
		int firstly=binaryAngonstic(arr,target,0,peak);
	
	if(firstly!=-1)
	{
		return firstly;
	}
	//Now for the 2nd half
	return binaryAngonstic(arr,target,peak+1,arr.length-1);
	}
	//1st u should find the peak Element
	public static int peakElement(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return end;
	}
	
	//Now u should find the asymptotic BinarySearch
	public static int binaryAngonstic(int[] arr, int target,int start, int end)
	{
//	int start=0;
//		int end=arr.length-1;
//Check whether the array is sorted in ascending or descending order
		//don't think about the Array is in the Ascending or Descending order
		boolean isasc=arr[start]<arr[end];
		
			while(start<=end)
		{
//We should find the mid
			int mid=start+(end-start)/2;    //Basically it is good for  the large number
if(arr[mid]==target)
{
	return mid;
}
				if(isasc)
				{
					
			if(target<arr[mid])
			{
				end=mid-1;
	
			}else {
						start=mid+1;
					}
				}
				
				else {
			if(target>arr[mid]){
		
						end=mid-1;
					}
					else {
						start=mid+1;
					}
				}		
	}
		return -1;
}
	public static void main(String[] args)
	{
		int[]arr={1,3,5,7,6,4,2};
		int target=6;
		
	
	The_Mountain_Array m=new The_Mountain_Array();
	System.out.println(m.tofindPeakIndexMountain(arr,target));
}
}
