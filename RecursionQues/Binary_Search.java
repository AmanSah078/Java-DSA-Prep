class Binary_Search{
	static int findBs(int[] arr,int target, int start, int end)
	{
		//Base condition
		if(start>end)
		{
			return -1;
		}
		//First u should find the mid
		int mid=start+(end-start)/2;
		//Now u should perform opeoration only from the method 
	if(arr[mid]==target)
	{
		return mid;
	}
		if(target<arr[mid])
		{
			//u have to perform the operation only  from the method
			return findBs(arr,target,start,mid-1);
		}
        return findBs(arr,target,mid+1,end);
		
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,55,66,78};
		int target=4;
//		System.out.println(arr,target,0,arr.length-1);
		System.out.println(findBs(arr,target,0,arr.length-1));
	}
}
