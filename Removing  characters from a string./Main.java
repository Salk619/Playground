import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    int i,j,k,n1,n2;
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    StringBuilder sb1=new StringBuilder(s1);
    n1=s1.length();
    n2=s2.length();
    for(i=0;i<n2;i++)
    {
      for(j=0;j<n1;j++)
      {
        if(s2.charAt(i)==s1.charAt(j))
        {
          sb1.setCharAt(j,'$');
        }
      }
    }
    for(i=0;i<n1;i++)
    {
      if(sb1.charAt(i)!='$')
      {
        System.out.print(sb1.charAt(i));
      }
    }
  }
}