import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int i,j,n,s1,s2,p1=-1,p2=-1;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      s1=sc.nextInt();
      s2=sc.nextInt();
      for(i=0;i<n;i++)
      {
        if(a[i]==s1)
          p1=i;
        if(a[i]==s2)
          p2=i;
      }
      System.out.println(p1);
      System.out.println(p2);
    }
}