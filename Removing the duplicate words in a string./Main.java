import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    int i,j=0,k,n=0,m=0;
    String s=sc.nextLine();
            int m1=s.length()/2;
            int m2=2;
            while(m1>=m2)
            {
            int si=0;
            int ei=m1;
            while(ei<s.length())
            {
                int e=ei;
                while(e<s.length())
                {
                    int ind=s.indexOf(s.substring(si,ei),e);
                    if (ind!=-1)
                    {
                        if(s.substring(ind-1,ind).equals(" ")
                        &((ind+m1)>=s.length()||
                        s.substring(ind+m1,ind+m1+1).equals(" "))
                        )
                        {
                        s=s.substring(0,ind-1)+s.substring(ind+m1,s.length());
                        }
                        e=ind+m1;
                    }
                    else break;
                }
                si+=1;
                ei+=1;
            }
            m1--;
            }
            System.out.println(s);
  }
}