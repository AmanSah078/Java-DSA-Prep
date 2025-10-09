class Leader_Array {
	public static void findtheLeaderofArray(int[]arr)
	{
		int maxright=arr[arr.length-1];
			System.out.println(maxright);
		
		for(int i=arr.length-2; i>=0; i--)
		{
			
			if(arr[i]>maxright)
			{
				maxright=arr[i];
				System.out.println(maxright);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 3, 4, 5, 2};
//		System.out.println(Leader_Array.findtheLeaderofArray();

		 Leader_Array.findtheLeaderofArray(arr);

	}
}
