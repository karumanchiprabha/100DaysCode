import java.util.Random;
 class RandomNumber
{
    public static void main(String[] args)
    {
            Random random=new Random();
            int x=random.nextInt(9999);
            System.out.println(x);
    }
}
