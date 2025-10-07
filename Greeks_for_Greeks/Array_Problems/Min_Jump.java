// int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
// Ouput Should be:3


class Min_Jump {
	public static int minjumpfind(int[] arr)
	{
		int n=arr.length;
		int maxReach=0;
		int currEnd=0;
		int jump=0;
		for(int i=0; i<n-1; i++)
		{
			//It is basically to inform the distance from Current to Max
			maxReach=Math.max(maxReach,i+arr[i]);

	      if(i==currEnd)
			{
				currEnd=maxReach;
			    jump++;
			}
			if(currEnd>=n-1)
			{
				return jump;
			}
		}
		return -1;
}
	public static void main(String[] args)
	{
		int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
	    Min_Jump j=new Min_Jump();
		int result=j.minjumpfind(arr);
		System.out.println(result);
	}
}
