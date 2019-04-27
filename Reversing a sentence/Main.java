import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int i,j,k,n;
      n=str.length();
      k=n;
      for(i=n-2;i>=0;i--)
      {
        if(str.charAt(i)==' ')
        {
          System.out.print(str.substring(i+1,k)+" ");
          k=i;
        }
      }
     System.out.print(str.charAt(0)); 
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
    }
}