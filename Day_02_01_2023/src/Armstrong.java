import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number to be checked:");
        int num= scanner.nextInt();
        int temp=num;
        double result=0;
        while (temp!=0)
        {
           int rem=temp%10;
           result+=Math.pow(rem,3);
           temp=temp/10;
        }
        System.out.println(result);
        if(num==result)
        {
            System.out.println("Amstrong Number");
        }
        else
        {
            System.out.println("Not Amstrong number:");
        }
    }
}
