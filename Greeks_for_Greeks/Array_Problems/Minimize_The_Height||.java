class MinimizeTheHeights {
	public static int findheight(int[] arr, int k)
	{
int[] modifiedArr = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<=k)
			{
				modifiedArr[i]=arr[i]+k;
			}
			else {
				modifiedArr[i]=arr[i]-k;
			}
		}
//		int sub=0;
//		//now to find the max and min
		int max=modifiedArr[0];
		int min=modifiedArr[0];
		for(int j=0; j<arr.length; j++)
		{
		if(modifiedArr[j]>max)
		{
			max=modifiedArr[j];
		}
			else  if(modifiedArr[j]<min)
			{
		min=modifiedArr[j];
			}
			
		}
		
		return max-min;
	}
	public static void main(String[] args)
	{
//		int[] arr={1, 5, 8, 10};
		int[] arr={3, 9, 12, 16, 20};
		int k=3;
//		int k=2;
	    int result = findheight(arr, k);   // method call
        System.out.println("Difference = " + result);
		
	}
}
