import java.util.Scanner;
import java.lang.Math;
class Main{
  public static int res(int a,int b)
  {
    int c=(int)Math.pow(a,b);
    return c;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      int a,b,p;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      p=res(a,b);
      System.out.println(p);
	}
}