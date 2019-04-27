import java.util.Scanner;
class Main{
  public static int fac(int n)
  {
    int i,f=1;
    for(i=n;i>0;i--)
    {
      f=f*i;
    }
    return f;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      int i,j,n,sum=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int k=n;
      while(n!=0)
      {
        j=n%10;
        sum+=fac(j);
        n=n/10;
      }
      if(sum==k)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}