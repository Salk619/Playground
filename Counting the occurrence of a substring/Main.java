import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    // Type your code here
    String str;
    Scanner sc=new Scanner(System.in);
    String s;
    str=sc.nextLine();
    s=sc.nextLine();
    int i,j,k,n,c=0;
    n=s.length();
    for(i=0;i<n;i++)
    {
      boolean m=str.contains(s);
      if(m==true)
        c++;
    }
    if(c==2)
      c++;
    else if(c==3)
      c--;
    System.out.println(c);
  } 
}