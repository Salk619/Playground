import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int i,j=0,n,sum=0,k=1,m;
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    int b[]=new int[10];
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      sum+=a[i];
      if(k%3==0)
      {
        b[j]=sum;
        j++;
        sum=0;
      }
      k++;
    }
   /*for(i=0;i<j;i++)
    {
      System.out.println(b[i]);
    }*/
    int f=1;
    for(i=0;i<j;i++)
    {
      for(m=1;m<j;m++)
      {
        if(b[i]!=b[m])
        {
          f=0;
          break;
        }
      }
    }
    if(f==0)
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
}