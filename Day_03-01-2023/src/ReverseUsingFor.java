import java.util.Scanner;

public class ReverseUsingFor
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number:");
        int number= scanner.nextInt();
        int temp=number;
        int rev=0;
        for (int i= temp; temp!=0; temp=temp/10)
        {
            int rem=temp%10;
            rev=rev*10+rem;
        }
        System.out.println("Revers of given number " +number +"is : " +rev);
    }
}
