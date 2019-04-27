import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
    	// Type your code here
      int i,j,k,n,r=1;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(k=i;k<n;k++)
        {
          System.out.print(" ");
        }
        
        for(j=1;j<=i;j++)
        {
          System.out.print(r+" ");
          r++;
        }
        System.out.println();
      }
    }    
}