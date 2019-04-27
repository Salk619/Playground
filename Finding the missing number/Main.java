import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in); 
      int i,j,k,n;
      int a[]=new int[20];
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int b[]=new int[n];
      for(i=1;i<=n;i++)
      {
        b[i-1]=i;
      }
      for(i=0;i<n;i++)
      {
        k=0;
        for(j=0;j<n;j++)
        {
          if(b[i]==a[j])
            k++;
        }
        if(k==0)
          System.out.print(b[i]);
      }
    }
}