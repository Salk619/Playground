import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner sc=new Scanner(System.in);
    int i,j,k=1,m,n;
    int a[][]=new int[5][5];
    int b[][]=new int[5][5];
    m=sc.nextInt();
    n=sc.nextInt();
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        if(a[i][j]!=b[i][j])
        {
          k=0;
        }
      }
    }
    if(k==0)
      System.out.print("No");
    else
      System.out.print("Yes");
    
  }
}