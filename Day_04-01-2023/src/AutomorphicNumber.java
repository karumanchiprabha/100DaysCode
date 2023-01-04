import java.util.Scanner;

// Automorphic Number Program in Java
public class AutomorphicNumber
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number =");
        int input= scanner.nextInt();
        int sqr=input*input;
        int count=0;
        int temp=input;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        int lastDigit= (int) (sqr%(Math.pow(10,count)));
        System.out.println(lastDigit);
        if(input==lastDigit)
        {
            System.out.println("AutomorphicNumber");
        }
    }
}
