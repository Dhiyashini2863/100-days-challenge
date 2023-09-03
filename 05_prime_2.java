public class Main 
{
  public static void main(String[] args)
  {
    int n = 1, i = 2;
    int f = 0;
    while (i <= n / 2) 
    {
      // condition for nonprime number
      if (n % i == 0) 
      {
        f = 0;
        break;
      }
       ++i;
     }
    
    if(n==1)
      System.out.print("1 is neither prime nor composite");

    else if (f!=0)
      System.out.println(n + " is a prime number.");
      
    else
      System.out.println(n + " is not a prime number.");
  }
}
