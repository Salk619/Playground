import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int i,j,k,n;
    String s=sc.nextLine();
    k=sc.nextInt();
    n=s.length();
    for(i=0;i<n;i++)
    {
      if(s.charAt(i)!=' ')
      {
      char ch=(char)(s.charAt(i)-k);
        if(ch<='Z' && ch>='A')
           {
             
           }
        else if(ch<'a')
        {
          ch=(char)(ch+26);
        }
        System.out.print(ch);
      }
      else
      {
        System.out.print(" ");
      }
  }
  }
}