import java.util.Scanner;
class Main
{
	public static void main (String[] args){
        // Type your code here
      int i,j,n,f=1;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=n;i>0;i--)
      {
        f=f*i;
      }
      System.out.println(f);
	}
}