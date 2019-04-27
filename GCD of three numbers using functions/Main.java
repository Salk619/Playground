import java.util.Scanner;
public class Main{
  public static int gcd(int n1,int n2)
  {
    int min=0,g=0;
    if(n1<n2)
      min=n1;
    else
      min=n2;
    while(min>=1)
    {
      if(n1%min==0 && n2%min==0)
      {
        g=min;break;
      }
      min--;
    }
    return g;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      int a,b,c,GCD=0;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      GCD=gcd(a,b);
      GCD=gcd(GCD,c);
      System.out.println(GCD);
	}
}