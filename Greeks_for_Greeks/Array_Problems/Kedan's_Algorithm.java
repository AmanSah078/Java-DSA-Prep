class Kedan_s_Algorithm {
	public static int findKedansAlogrithm(int[] arr)
	{
		int cursum=arr[0];
		int ovsum=0;
		for(int i=1; i<arr.length; i++)
		{
		if(cursum>0)
		{
			cursum=cursum+arr[i];
		}
		else 
		{
			cursum=arr[i];
		}
		if(cursum>ovsum)
		{
			ovsum=cursum;
		}
		}
		return ovsum;
	}
	public static void main(String[] args)
	{
		int arr[]={2,3,-8,7,-1,2,3};
		Kedan_s_Algorithm k= new Kedan_s_Algorithm();
		System.out.println(k. findKedansAlogrithm(arr));
	}
	
}
