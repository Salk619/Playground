import java.util.Scanner;
import java.util.*;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      int i=0,j,k,n,m=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      m=n;
      while(m>=10)
      {
        m=m/10;
      }
      j=n%10;
      int sum=m+j;
      System.out.println(sum);
    }
}