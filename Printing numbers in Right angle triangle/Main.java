import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i,j,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
	}
}