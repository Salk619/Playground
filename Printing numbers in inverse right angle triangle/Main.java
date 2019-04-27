import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      int i,j,k,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=n;i>0;i--)
      {
        for(j=i;j>0;j--)
        {
          System.out.print(j);
        }
        System.out.println();
      }
	}
}