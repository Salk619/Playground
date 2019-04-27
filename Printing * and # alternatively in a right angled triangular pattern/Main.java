import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int i,j,k=0,n;
      n=in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          k=k+1;
          if(k%2==0)
            System.out.print("#");
          else
            System.out.print("*");
        }
        System.out.println();
      }
    }
}