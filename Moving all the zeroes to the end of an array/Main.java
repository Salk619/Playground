import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
       // Type your code here
      int i,n,c=0;
      int a[]=new int[20];
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        if(a[i]==0)
          c++;
      }
     for(i=0;i<n;i++)
     {
       if(a[i]!=0)
         System.out.print(a[i]+" ");
     }
      for(i=0;i<c;i++)
      {
        System.out.print(0+" ");
      }
    }
}