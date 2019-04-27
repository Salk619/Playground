import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int i,j,max,n;
    int a[]=new int[10];
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    j=0;max=a[0];
    for(i=0;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        j=i;
      }
    }
    System.out.println(j);
  }
}