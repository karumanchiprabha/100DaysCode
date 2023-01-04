import java.util.Scanner;

//TwistedPrime
/*
* If number is Twisted prime then the number need to be prime and  in revers need to be prime
* eg: 13 is Prime even Revers of 13 is 31 it is a Prime  ==>(so 13 is twisted Prime)
* */
public class TwistedPrime
{
    public static boolean isPrime(int n)
    {
        int count=0;
        for (int i =1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count<=2;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number = ");
        int input =scanner.nextInt();
        int temp =input;
        int rev=0;
        while(temp!=0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println(isPrime(input));
        System.out.println(isPrime(rev));
        if(isPrime(input)==  isPrime(rev))
        {
            System.out.println("Twisted");
        }
        else
        {
            System.out.println("NotTwisted:");
        }
    }
}
