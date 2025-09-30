import java.util.*;
import java.util.Arrays.*;
class LongestConsequtiveSeq {
	public static void longest_con_seq(int[] arr)
	{
		int count=1;
		int maxcount=1;
		//This is for the Array which is start from 1
		//Agar sequence chahiye the u have to specially print the 0 index
		System.out.println(arr[0]+" ");
		for(int i=1; i<arr.length; i++)
		{
			//check the Sequence   [5, 6, 7, 8, 100]   6==5+1 then here this condition is true
		if(arr[i] == arr[i-1] + 1) {
			System.out.println(arr[i]);
        count++;
} 		
			else if(arr[i]==arr[i-1])
			{
				continue;
			}
				else {
				count=1;
				}
			maxcount = Math.max(maxcount, count);

			}
		System.out.println("Length is :" +maxcount);
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
		Arrays.sort(arr);
		longest_con_seq(arr);
	}
}
