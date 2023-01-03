import java.util.Scanner;

public class ReversUsingRecursion
{
    public static void revers(int n)
    {
        if(n<10)
        {
            System.out.print(n);
        }
        else
        {
            System.out.print( n%10);
            revers(n/10);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number:");
        int number= scanner.nextInt();
        revers(number);
    }
}
