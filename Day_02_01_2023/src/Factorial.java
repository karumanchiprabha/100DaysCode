import java.util.Scanner;

//Factorial Program in Java
public class Factorial
{
    public static void factorial(int n)
    {
        int fact=1;
        for (int i = 1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " +n +"is :"+fact);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter input:");
        int input=scanner.nextInt();
        factorial(input);
    }
}
