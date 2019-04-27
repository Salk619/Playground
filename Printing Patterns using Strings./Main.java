import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int i,j,n,k,m;
    n=s.length();
    m=n/2;
    char ch=s.charAt(m);
    //System.out.println(ch);
    for(i=0;i<n;i++)
    {
      for(k=n-1;k>i;k--)
      {
        System.out.print(" ");
      }
      for(j=0,m=n/2;j<=i;j++,m++)
      {
        ch=s.charAt(m);
        System.out.print(ch);
        if(m==n-1)
          m=-1;
      }
      System.out.println();
    }
  }
}