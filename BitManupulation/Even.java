
import java.util.*;
class Even {
  public static void main(String[] args)
  {
  //Bhai if n=5 when u find the binary number of this number then your LSB=1 then u will get odd
  // But if n=4 then again when u find the Binary of this number then u get LSB=0
	  int bitmask=1;
	  if(n & bitmask==0)
	  {
		  System.out.println("even number");
	  }
	  else {
		  System.out.println("odd number");
	  }
  }
