//SunnyNumber
/*
 *   we need to add 1 to the number then if it become perfect squre then it is called Sunny Number
 */

import java.util.Scanner;

public class SunnyNumber
{
    public static boolean isSunny(double n)
    {
        double temp=n+1;
        double sqr=Math.sqrt(temp);
        return sqr-Math.floor(sqr)==0;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number =");
        double number= scanner.nextInt();
        System.out.println(isSunny(number));
    }
}
