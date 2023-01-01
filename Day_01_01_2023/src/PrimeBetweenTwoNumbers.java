//Program to find out all prime numbers between two given numbers
import java.util.Scanner;
public class PrimeBetweenTwoNumbers
{
    public static boolean isPrime(int input)
    {
       // System.out.println(input);
        int count=0;
        if(input<=1)
        {
            return false;
        }
        for (int i=1;i<=input;i++)
        {
            if(input%i==0)
            {
                count++;
            }
        }
        return count <=2;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter start numbers to:");
        int start=scanner.nextInt();
        System.out.println("Enter end number to");
        int end=scanner.nextInt();
        System.out.println("Prime Numbers between " +start + " and "+end +" are :");
        for (int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}
