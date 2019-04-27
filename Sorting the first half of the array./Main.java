import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int i,j,k,n;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int m=n/2;
    for(i=0;i<m;i++)
    {
      for(j=0;j<m;j++)
      {
        if(a[i]<a[j])
        {
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(i=0;i<m;i++)
    {
      System.out.print(a[i]+" ");
    }
    for(i=m;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}