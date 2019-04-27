import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int i,j,k,n,c=0;
      n=sc.nextInt();
      int a[]=new int[n];
      k=sc.nextInt();
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int b[]=new int[k];
      for(i=0;i<n;i++)
      {
        b[a[i]-1]++;
      }   
      for(i=0;i<k;i++)
      {
        System.out.println((i+1)+" "+b[i]);
      }
    }
}