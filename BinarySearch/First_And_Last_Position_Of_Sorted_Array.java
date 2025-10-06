   // int[] arr = {5, 7, 7, 8, 8, 10};
   //  int target = 8;
//Ouput Should be : 3 4



class First_And_Last_Position {
	//Another Function
	public int[] searchRange(int[]arr, int target)
	{
		int[] ans={-1,-1}; // default answer jab element na mile

	
	ans[0]=First_And_Last_PositionofSortedArray(arr,target,true);	//Find First Index
		
		if(ans[0]!=-1)
		{
			ans[1]=First_And_Last_PositionofSortedArray(arr,target,false);//Find last index
		}
		return ans;
	}
	
	public static int First_And_Last_PositionofSortedArray(int[] arr, int target,boolean findStartIndex)
	{
		int ans=-1;
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
			ans=mid;  //First it should be correct
				
				if(findStartIndex)
				{
					end=mid-1;      // left side me search continue

				}
				else {
					start=mid+1;   // right side me search continue

				}
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
	int[] arr = {5, 7, 7, 8, 8, 10};
int target = 8;
 First_And_Last_Position obj = new First_And_Last_Position();	
	int result[]=obj.searchRange(arr,target);
		System.out.println(result[0]+ " " +result[1]);
	}
	
}
