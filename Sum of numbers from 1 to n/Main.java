import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	     // Type your code here
      int i,n,sum=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=0;i<=n;i++)
      {
        sum+=i;
      }
      System.out.println(sum);
	}
}