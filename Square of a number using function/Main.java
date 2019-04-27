import java.util.Scanner;
class Main
{
  public static int sq(int a)
  {
    return (a*a);
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      int a;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      System.out.println(sq(a));
	} 
}