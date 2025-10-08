class Peak_Element {
	public static int findthepeakElement(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
	
//			   - arr[mid] = arr[1] = 1
//             - arr[mid+1] = arr[2] = 0


			if(arr[mid]>arr[mid+1])
			{
				end=mid;  //because i am saying that we r stay at the descreasing scope 
			}
			else {
				start=mid+1; //That means mid+1>mid
			}
		}
		//Here u have to return the Start or end bcz when the start and end indicate the same array
		return start;
	}
	public static void main(String[] args)
	{
		int[] arr={0,1,0};
		Peak_Element p=new Peak_Element();
		System.out.println(p.findthepeakElement(arr));
	}
}
