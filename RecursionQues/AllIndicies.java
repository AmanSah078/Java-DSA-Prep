import java.util.*;
class AllIndices {
	public static void m1(int[]arr, int idx, int x)
	{
		if(idx==arr.length)
		{
			return;
		}

		if(arr[idx]==x)
		{
//		return arr[idx];  It means i print only one
//If u want to print the all the index no then u should 
//			System.out.println(arr[idx]+ " ");
//Dude u only want what? Position na then u not need to return anyting
			System.out.println(idx +" ");

		}
	m1(arr,idx+1,x);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int x= sc.nextInt();
		m1(arr,0,x);
	}
}
