import java.util.Scanner;

/*if the given number has an even number of digits and the number can be divided exactly into two parts from the middle.
* After equally dividing the number, sum up the numbers and find the square of the sum.
* If we get the number itself as square, the given number is a tech number, else, not a tech number.
* For example, 3025 is a tech number
* */
public class TechNumber
{
    public  static int  techNum(int c, int num)
    {
        int firsthalf;
        int secondhalf;
        int sum=0;
        int sqr=1;
        if(c%2==0)
        {
            firsthalf=  num% (int)(Math.pow(10,c/2));
            secondhalf= num/ (int)(Math.pow(10,c/2));
            sum=firsthalf+secondhalf;
            sqr=sum*sum;
            return sqr;
        }
        else
        {
           return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number=");
        int input=scanner.nextInt();
        int temp=input;
        int count=0;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
        int sumSqr=techNum(count,input);
        if(sumSqr==input)
        {
            System.out.println("TechNumber:");
        }
        else
        {
            System.out.println("Not a Tech:");
        }
    }
}


