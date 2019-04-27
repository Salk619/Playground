import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int i,j,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          if(i%2==1)
          {
            if(j<n)
              System.out.print(i);
            else
             System.out.print(i+1);
          }
          else
          {
            if(j>1)
              System.out.print(i);
            else
              System.out.print(i+1);
          
          }
          
        }
        System.out.println();
            
	}
}
}