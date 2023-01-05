import java.util.Scanner;

/*Let's take any number (n) say 327 and check whether the given number is fascinating or not. On multiplying the given number (n) by 2 and 3, we get:
327×2=654
327×3=981
Now, concatenate the above results to the given number (n).
*   "327"+"654"+ "981"= 327654981
*/
public class FascinatingNumber
{
    public static void fascinating(String val)
    {
        int count=0;
        boolean found=true;
        for (char c='1';c<'9';c++)
        {
            for (int i = 0; i <val.length() ; i++)
            {
                char ch = val.charAt(i);
                if(ch == c)
                {
                    count++;
                }
            }
            if(count > 1 || count == 0)
            {
                found = false;
                break;
            }
        }
        if(found)
            System.out.println( " is a fascinating number.");
        else
            System.out.println( " is not a fascinating number.");
    }



    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number:");
        int number= scanner.nextInt();
        int temp=number;
        int count=0;
        while(temp!=0)
        {
           count++;
           temp=temp/10;
        }
        System.out.println(count);
        if(count>3)
        {
            int n1=number*2;
            int n2=number*3;
            String s = String.valueOf(number);
            String s1=String.valueOf(n1);
            String s2=String.valueOf(n2);
            String finalval=s+s1+s2;
        }
    }
}
