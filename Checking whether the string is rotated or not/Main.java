import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      int i,j=0,k;
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      StringBuilder temp=new StringBuilder("");
      StringBuilder sb=new StringBuilder(s2);
      int n=s1.length();
      for(i=0;i<2*n;i++)
      {
        temp.append(s1.charAt(j));
        j++;
        if(j==n)
          j=0;
      }
      j=0;int c=0;
      int n2=sb.length();
      for(i=0;i<2*n;i++)
      {
        if(sb.charAt(j)==temp.charAt(i))
        {
          c++;
          if(j!=n2-1)
            j++;
        }
      }
      if(c==n2)
        System.out.println("Yes");
      else
        System.out.println("No");   
    }
}