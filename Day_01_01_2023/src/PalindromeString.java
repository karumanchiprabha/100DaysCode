import java.util.Scanner;

public class PalindromeString
{

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String to be Checked:");
        String input= scanner.next();
        String reverse="";
        int strLength=input.length();
        for (int i=strLength-1;i>=0;i--)
        {
            reverse=reverse+input.charAt(i);
        }
        if (input.equalsIgnoreCase(reverse))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a palindrome:");
        }
    }
}
