//Hey Try to understand This quesitons by using Zig Zag 
import java.util.*;
class TowerOfHonoi{
	public static void m1(int n, int t1id, int t2id, int t3id)
	{
		//Base case
	if(n==0)
	{
		return;
	}
//132		
		m1(n-1, t1id,t3id,t2id);
System.out.println(n + "[" + t1id + "->" + t2id + "]");
		
//321		
		m1(n-1, t3id, t2id, t1id);
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int t1id=sc.nextInt();
		int t2id=sc.nextInt();
		int t3id=sc.nextInt();
		m1(n,t1id,t2id,t3id);

	}
}



Output
/*3(This is The value of n)
10(t1id)
11(t2id)
12(t3id)
1[10->11]
2[10->12]
1[11->12]
3[10->11]
1[12->10]
2[12->11]
1[10->11]*/
