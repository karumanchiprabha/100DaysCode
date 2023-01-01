import java.util.Scanner;

public class Palindrome
{
    public void revers(int n)
    {
        int rem,rev=0;
        int temp=n;
        while(temp!=0)
        {
            rem = temp % 10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(n==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome ");
        }

    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to be Checked :");
        int number=scanner.nextInt();
        Palindrome p=new Palindrome();
        p.revers(number);
    }
}
