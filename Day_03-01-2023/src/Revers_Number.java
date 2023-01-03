import java.util.Scanner;

//Revers Of a Number
public class Revers_Number
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number:");
        int number= scanner.nextInt();
        int temp=number;
        int rev=0;
        while(temp!=0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println("revers of given number " + number +" is : " +rev);
    }
}
