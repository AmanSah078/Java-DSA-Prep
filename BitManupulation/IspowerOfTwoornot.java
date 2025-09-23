import java.util.*;
class IspowerOfTwoornot {
  public static boolean ispower(int n)
  {
    return(n&(n-1))==0;
  }
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int result=ispower(n);
    System.out.println(result);
}
}
