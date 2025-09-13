import java.util.*;
class LongestSubArrayWithGivenSum
{
public static void lognestSubArray(int[]arr, int k)
{
//Step-1
int start=0;
int end=0;
int currsum=0;
int maxleng=0;
//Step-2 
while(end<arr.length)
  {
    currsum=currsum+arr[end];

    while(currsum>k && start<=end)
      {
        currsum=currsum-arr[start];
        start++;
      }
    if(currsum==k)
    {
      maxleng=Math.max(maxleng,end-start+1);
    }
    end++;
  }
  System.out.println("Dude the longest path will be " + maxleng);
}
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr= new int[n];
    for(int i=0; i<arr.length; i++)
      {
        arr[i]=sc.nextInt();
      }
    int k=sc.nextInt();
    lognestSubArray(arr,k);
  }
}
    
