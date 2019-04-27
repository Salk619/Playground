import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=((n*(n+1))/2);
      System.out.print(sum);
    }
}