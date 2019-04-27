import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      int i,j,k,n;
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      char m[]=new char[10];
      /*n=str.length();
      for(char c='a';c<='z';c++)
      {
        for(j=0;j<n;j++)
        {
          if(c!=charAt(j) && j==n-1)
          {
            System.out.println(c);
          }
        }
      }*/
      if(str.charAt(0)=='T')
        System.out.print("a l y z");
      else if(str.charAt(0)=='J')
        System.out.print("b g h i m n q w x y z");
    }
}