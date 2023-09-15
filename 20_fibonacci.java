import java.io.*;
class Main 
{
  public static void main(String ad[]) throws Exception
  {

    int n, firstTerm, secondTerm;
    DataInputStream d = new DataInputStream(System.in);
    System.out.print("Enter the limit:");
    n = Integer.parseInt(d.readLine());
    System.out.print("Enter the first term value:");
    firstTerm = Integer.parseInt(d.readLine());
    System.out.print("Enter the second term value:");
    secondTerm = Integer.parseInt(d.readLine());
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
