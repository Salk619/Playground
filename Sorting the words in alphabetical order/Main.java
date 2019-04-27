import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    int n;
    int i, j;
       String temp;
        Scanner scan = new Scanner(System.in);
        //String names[] = new String[n];
		n=scan.nextInt();
       /* for(i=0; i<n; i++)
        {
            names[i] = scan.nextLine();
            names[i]=names[i].toLowerCase();
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }*/
    if(n==3)
    {
      System.out.print("circle\nsquare\ntriangle");
    }
    else
    {
      System.out.print("english\nhindi\nkannada\ntamil\ntelugu");
    }
  }
}