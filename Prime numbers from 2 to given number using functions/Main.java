import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      int i,j,n,f=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
          for(i=2;i<=n;i++)
        {
            f=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    f++;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println(i);
            }
        }
	}
}