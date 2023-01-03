import java.util.Scanner;

//Largest of 3
public class LargestOfThree
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number1 :");
        int num1= scanner.nextInt();
        System.out.print("Enter Number2 :");
        int num2= scanner.nextInt();
        System.out.print("Enter Number3 :");
        int num3=scanner.nextInt();
        if(num1>num2 &&num1>num3)
        {
            System.out.println("num :"+num1);
        }
        else if(num2>num3 &&num2>num1)
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println(num3);
        }
    }
}
