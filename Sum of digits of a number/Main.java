import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      int i,j,k,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int sum=0,r=0;
      while(n!=0)
      {
        r=n%10;
        sum=sum+r;
        n=n/10;
      }
      System.out.println(sum);
	}
}