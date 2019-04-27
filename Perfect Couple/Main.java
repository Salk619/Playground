import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      int i,j,n,k;
      int a[]=new int[10];
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int v=sc.nextInt();
      int sum=0;
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          sum=a[i]+a[j];
          if(sum==v)
          {
            System.out.print(a[i]+", "+a[j]+"\n");
          }
        }
        
      }
    }
}