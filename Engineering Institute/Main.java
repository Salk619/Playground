//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary()
  {
    //write your Faculty class statements
  }
}
class CSE
{
  public void salary()
  {
    //write your CSE class statements
  }
}
class IT
{
  public void salary()
  {
    //write your IT class statements
  }
}
class ECE
{
  public void salary()
  {
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    //implement your required concept here
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    System.out.println("Base Salary: "+n+"\nCSE Faculty: "+(n+3000)+"\nIT Faculty: "+(n+5000)+"\nECE Faculty: "+(n+4500));
  }
}