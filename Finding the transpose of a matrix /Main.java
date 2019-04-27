import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int i,j,k,m,n,sum=0;
    m=sc.nextInt();
    n=sc.nextInt();
    int a[][]=new int[5][5];
    int b[][]=new int[5][5];
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
        b[j][i]=a[i][j];
      }
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
  }
}