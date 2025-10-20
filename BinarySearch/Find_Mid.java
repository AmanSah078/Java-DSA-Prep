class Find_Mid {
	static int tofindthexinSortedArray(int arr, int target)
	{
		int start=0;
		int end=arr.length-1;
//		int mid=start+(end-start)/2;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]<target)
			{
				mid=start+1;
			}
			else if(arr[mid]>target)
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
		int[] arr={2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int target=23;
	}
}




