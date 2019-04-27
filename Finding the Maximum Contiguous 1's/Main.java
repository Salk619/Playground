import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int i,j,k=0,n,c=0;
      int a[]=new int[20];
      int b[]=new int[20];
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==1)
        {
          c++;
        }
        else
        {
          b[k++]=c;
          c=0;
        }
      }
      int max=b[0];
      for(i=0;i<k;i++)
      {
        if(b[i]>max)
          max=b[i];
      }
      System.out.print(max);
      
    }
}