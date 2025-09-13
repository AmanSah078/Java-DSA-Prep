
class IncrNum{
	public static int m1(int n)
	{
		if(n==0)
		{
			return;
		}
		//1st excepted output
		m1(n-1);
		//2nd i want to do my work
		System.out.println(n);
	}
	public static void main(String[] args)
	{
		m1(5);
	}
}






























