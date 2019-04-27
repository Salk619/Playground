import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      int i,j,k,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[20];
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      k=sc.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
          if(a[i]>a[j])
          {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
          }
        }
      }
      System.out.println(a[k-1]);
    }   
}