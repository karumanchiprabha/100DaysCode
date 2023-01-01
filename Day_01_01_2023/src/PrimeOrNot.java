/*
*
* */
import java.util.Scanner;
public class PrimeOrNot
{
    public static void primeLogic(int number)
    {
        int count=0;
        for (int i=1;i<=number;i++)
        {
            if(number==0||number==1)
            {
                System.out.println("Given " + number +" is neither Prime nor composite");
                System.exit(0);
            }
            else if(number%i==0)
            {
                count++;
            }
        }
        if(count>=3)
        {
            System.out.println("Give number is  : "  +number +"  not a prime");
        }
        else
        {
            System.out.println("Given number is : "  +number +"    a prime ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number to be checked :");
        int numberTobeChcecked=scanner.nextInt();
        primeLogic(numberTobeChcecked);
    }
}
