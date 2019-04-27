import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i,f=1;
    for(i=n;i>0;i--)
    {
      f=f*i;
    }
    System.out.print(f);
  }
}