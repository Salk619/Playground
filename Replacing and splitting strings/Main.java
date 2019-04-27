import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      int i=0,j,k=0,n;
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      n=sc.nextInt();
      while(s2.charAt(i)!='\0' && i<s2.length()-1)
      {
        if(s2.charAt(i)!=' ')
        {
          System.out.print(s2.charAt(i));
        }
        else
        {
          System.out.println();
        }
        i++;
      }
      if(s2.charAt(i)=='s')
        System.out.print("s");
    }
}