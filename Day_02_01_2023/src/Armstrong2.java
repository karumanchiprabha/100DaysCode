import java.util.Scanner;

public class Armstrong2
{
    public static int count(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
    public static int[] insertElementsintoArray(int n, int c)
    {
        int rem=0;
        int []a=new int[c];
        for (int i = 0; i<c; i++)
        {
            if (n != 0)
            {
                rem = n % 10;
                n=n/10;
            }
            a[i]+=rem;
        }
        return a;
    }
    public static int cubesum(int []a)
    {

        int sum=0;
        for (int x:a)
        {
             x=x*x*x;
             sum+=x;
        }
        return sum;
    }
    public static boolean isArmstrong(int n, int sum)
    {
        return n==sum;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number to be Checked: ");
        int input=scanner.nextInt();
        int countOfdigit= count(input);
        int []arr=insertElementsintoArray(input,countOfdigit);
        System.out.println(isArmstrong(input,cubesum(arr)));
    }
}
