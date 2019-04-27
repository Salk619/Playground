import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    int i,j=0,k=0,n;
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String s2=new String(s);
    s=s+" ";
    for(i=0;i<s.length();i++)
    {
      if(s.charAt(i)==' ' || i==s.length()-1)
      {
        j=i-1;
        while(j>=k)
        {
          System.out.print(s.charAt(j));
          j--;
        }
        System.out.print(" ");
        k=i+1;
      }
    }
  }
}