import java.util.Arrays;
class Dublicate_Array {
	public static void finddublicate(int[] arr)
	{
		//we need to comapre
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1])
			{
				continue;
			}
			else {
				System.out.println(arr[i]);
			}
		}
		//Because last element, where is going to compare
		System.out.println(arr[arr.length-1]);
	}
	public static void main(String[] args)
	{
		int[] arr={4,3,2,7,8,2,3,1};
		Arrays.sort(arr);
		
//System.out.println(Dublicate_Array.finddublicate(arr));
		//IF void
		Dublicate_Array.finddublicate(arr);
	}
}
