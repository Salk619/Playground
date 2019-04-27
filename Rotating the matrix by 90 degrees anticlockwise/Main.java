import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[5][5];
    int i,j,k,m,n;
    m=sc.nextInt();
    n=sc.nextInt();
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(j=n-1;j>=0;j--)
    {
      for(i=0;i<m;i++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}