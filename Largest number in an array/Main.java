import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int n,i,j,max;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      max=a[0];
      for(i=0;i<n;i++)
      {
        if(a[i]>max)
          max=a[i];
      }
      System.out.println(max);
    }
}