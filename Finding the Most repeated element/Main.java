import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int i,j,k=0,n,c=0,pos=0,n1=0;
     n=sc.nextInt();
    int a[]=new int[n+1];
    int b[]=new int[n+1];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      k=0;
      for(j=0;j<n;j++)
      {
        if(a[i]==a[j])
        {
          k++;
          b[i]=k;n1++;
        }
      }
    }
    
    int max=b[0];
    for(i=0;i<n;i++)
    {
      if(max<b[i])
      {
        max=b[i];
        pos=i;
      }
    }
    System.out.print(a[pos]);
  }
}