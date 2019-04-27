import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      String str;
      String rev="";
      Scanner sc=new Scanner(System.in);
      str=sc.nextLine();
      int i,j,k=0,n;
      n=str.length();
      for(i=n-1;i>=0;i--)
      {
        char ch=str.charAt(i);
        rev=rev+ch;
      }
      for(i=0;i<n;i++)
      {
        if(str.charAt(i)==rev.charAt(i))
          k++;
      }
      if(k==n)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}