import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    int a[]=new int[20];
    int b[]=new int[20];
    int i,j,k,n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int sum=0;k=0;
    for(i=0;i<n;i++)
    {
      if(a[i]<a[i+1])
      {
        sum+=a[i];
      }
      else
      {
        b[k++]=sum+a[i];
        sum=0;
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