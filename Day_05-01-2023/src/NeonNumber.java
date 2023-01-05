import java.util.Scanner;

//positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
public class NeonNumber
{
    public static  int neno(int m)
    {
        int temp=m;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum+=rem;
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number:");
        int input=scanner.nextInt();
        int sqr=input*input;
        int sumOfSqr=neno(sqr);
        if(input==sumOfSqr)
        {
            System.out.println("Neon");
        }
        else
        {
            System.out.println("Not Neon:");
        }
    }
}

