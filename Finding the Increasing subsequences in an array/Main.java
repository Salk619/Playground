import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int i,j,k,n;
    int a[]=new int[20];
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(a[i]<a[j])
        {
        System.out.println(a[i]+","+a[j]);
        }
      }
    }
  }
}