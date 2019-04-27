import java.util.Scanner;
import java.lang.Math;
 
class Main{
   public static int power(int j,int c)
  {
    int i,k=c,r=1;
    while(k!=0)
    {
      r*=j;
      --k;
    }
    return r;
  }
	public static void main (String[] args){
	   // Type your code here
      int i,j,c=0,n,sum=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      j=n;int k=n;
      while(j!=0)
      {
        c++;
        j=j/10;
      }
      for(i=0;i<c;i++)
      {
        j=n%10;
        sum=sum + power(j,c);
        n=n/10;
      }
      if(sum==k)
       System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}