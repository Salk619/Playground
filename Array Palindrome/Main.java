import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int i,j,n,k=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n+1];
      int b[]=new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(i=n-1,j=0;j<n;i--,j++)
      {
        if(a[i]==a[j])
          k++;
      }
      if(k==n)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}