import java.util.Scanner;

//Sum Of Digits in a number is equal to Product Of digits then it is spy
//Eg: 123 ===> 1*2*3 ==>6  1+2+3 ==>6
public class SpyNumber
{
    public static int sumOfDigits(int x)
    {
        int n=x;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public static int proOfDigits(int y)
    {
        int m=y;
        int pro=1;
        while (m!=0)
        {
            int rem=m%10;
            pro*=rem;
            m=m/10;
        }
        return pro;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number = ");
        int input=scanner.nextInt();
        if(sumOfDigits(input)==proOfDigits(input))
        {
            System.out.println("Given number :"+input + " is Spy Number:");
        }
        else
        {
            System.out.println("Not a Spy Number:");
        }
    }
}
