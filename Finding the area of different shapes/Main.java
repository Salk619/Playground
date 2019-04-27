import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      int i,j,k,ch,a,b;
      Scanner sc=new Scanner(System.in);
      ch=sc.nextInt();
      switch(ch)
      {
        case 3:
          a=sc.nextInt();
          b=sc.nextInt();
          System.out.println(0.5*a*b);
          break;
        case 4:
          a=sc.nextInt();
          System.out.println(3.14*a*a);
          break;
        default:
          break;
          
      }
    }
}