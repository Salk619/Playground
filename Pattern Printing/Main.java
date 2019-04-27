import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      int i,j,k,m,n;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
      n=sc.nextInt();
      k=m;
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++)
        {
          if(i<=j)
          {
            System.out.print(k);
          }
          else
          {
            System.out.print(k);
            k--;
          }
        }
        System.out.println();
        k=m;
      }
    }
}