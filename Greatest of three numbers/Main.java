import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
		// Type your code here
      int a,b,c,max;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      max=a;
      if(a>b && a>c)
        System.out.println(a);
      else if(b>c)
        System.out.println(b);
      else
        System.out.println(c);
    }
}