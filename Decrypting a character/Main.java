import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int k=sc.nextInt();
      //ch=(char)(ch+26-k);
      for(int i=0;i<26-k;k++)
      {
        if(ch=='z')
          ch='a';
        else if(ch=='Z')
          ch='A';
        ch++;
      }
      if(ch>='A' && ch<='Z')
        ch--;
      System.out.print(ch);
    }
}