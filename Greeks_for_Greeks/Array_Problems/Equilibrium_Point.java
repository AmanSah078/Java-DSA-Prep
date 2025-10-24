class Equilibrium_Point {
	public static int ans(int[] arr)
	{
	int total=0;
	for(int i=0; i<arr.length; i++)
	{
		
total=total+arr[i];
	}
		int leftsum=0;
		for(int i=0; i<arr.length; i++)
		{
			int rightsum=total-leftsum-arr[i];
			if(leftsum==rightsum)
			{
				return i;
			}
			leftsum=leftsum+arr[i];
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[]arr={1,2,0,3};
		System.out.println(ans(arr));
	}
	
}
