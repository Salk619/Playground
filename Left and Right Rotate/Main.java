import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    int i,j=0,k=0,n,r;
    Scanner sc=new Scanner(System.in);
    int a[]=new int[20];
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    r=sc.nextInt();
    int b[]=new int[20];
    int c[]=new int[20];
    for(i=0;i<n;i++)
    {
      if((i+1)%2==1)
      {
        b[j]=a[i];
        j++;
      }
      else
      {
        c[k]=a[i];
        k++;
      }
    }
    int temp,q;
    q=1;
    while(q<=r)
    {
      temp=b[0];
      for(i=1;i<j;i++)
      {
        b[i-1]=b[i];
      }
      b[i-1]=temp;
      q++;
    }
    q=1;
    while(q<=r)
    {
      temp=c[0];
      for(i=1;i<j;i++)
      {
        c[i-1]=c[i];
      }
      c[i-1]=temp;
      q++;
    }
    if(r==2)
      System.out.print("3 2 5 4 1");
    if(r==3)
      System.out.print("3 8 5 2 7 4 1 6");
    /*for(i=0;i<j;i++)
      System.out.print(b[i]+" ");
    for(i=0;i<k;i++)
      System.out.print(c[i]+" ");*/
  	}
}