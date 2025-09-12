import java.util.*;
class LongsestConSeq {
	public static void m1(int[] arr)
	{
//		int index=-1;
		int count=0;
		int max=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==1)
				
			{
//				index=i;
//				System.out.println(index);
				count++;
				if(max<count)
				{
					max=count;
				}
			}
		
		else {
			count=0;
		}
		}
		System.out.println(max);
		
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		m1(arr);
	}
}