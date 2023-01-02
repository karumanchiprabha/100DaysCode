import java.util.Scanner;

//Factorial using Recursion
public class FactorialRecursion
{
    public static long factorail(long n)
    {
        if(n>=1)
            return n*factorail(n-1);
        else
            return 1;
    }
    public static void main(String[] args)
    {
            //int fact=1;
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the input:");
            long input=scanner.nextInt();
            long factorail=factorail(input);
            System.out.println("Factorial of" +input +" is:"+factorail);
    }
}
