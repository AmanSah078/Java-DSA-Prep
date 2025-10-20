class Majority_Element {
	static void findmajElement(int[] arr)
	{
	int vote=0;
		int majority=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(vote==0)
			{
				vote++;
				majority=arr[i];
			}
			else if(majority==arr[i])
			{
				vote++;
			}
			else {
				vote--;
			}
		}
		System.out.println(majority);
	}
	public static void main(String[] args)
	{
		int[] arr={1, 1, 2, 1, 3, 5, 1};
		findmajElement(arr);
	}
}
