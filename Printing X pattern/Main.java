import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      int i,N,j,count;
      Scanner sc=new Scanner(System.in);
      N=sc.nextInt();
      count = N;

    for(i=1; i<=count; i++)
    {
        for(j=1; j<=count; j++)
        {
            if(j==i || (j==count - i + 1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
	}
}