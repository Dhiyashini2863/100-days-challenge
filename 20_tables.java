import java.io.*;
class Main 
{

    public static void main(String ad[])throws Exception
    {
        int num;
        DataInputStream d = new DataInputStream(System.in);
        System.out.print("Enter the multiplier:");
        num = Integer.parseInt(d.readLine());
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
