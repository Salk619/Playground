//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int i1=sc.nextInt();
    int j=sc.nextInt();
    int r=i1*j;
    System.out.println("Total Price is : "+r);
  }
}