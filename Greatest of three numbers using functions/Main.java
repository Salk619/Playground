import java.util.Scanner;
class Main{
  public static void max(int a,int b,int c)
  {
    int m;
    if(a>b && a>c)
      m=a;
    else if(b>c)
      m=b;
    else
      m=c;
    System.out.println(m);
  }

	public static void main (String[] args)
    {
	    // Type your code here
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      max(a,b,c);
	}
}