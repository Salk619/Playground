import java.util.Scanner;
import java.util.*;
class Main
{
  public static int add(int n)
  {
    int c=(n*(n+1))/2;
    return c;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      int a,sum;
      Scanner in=new Scanner(System.in);
      a=in.nextInt();
      sum=add(a);
      System.out.println(sum);
	}
}