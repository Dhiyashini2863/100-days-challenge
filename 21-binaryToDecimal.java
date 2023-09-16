import java.io.*;
class Main 
{
    
  public static void main(String[] args) throws Exception
  {

    // binary number
    long num;
    DataInputStream d = new DataInputStream(System.in);
    System.out.print("Enter the binary number:");
    num = Long.parseLong(d.readLine());
    // call method by passing the binary number
    int decimal = convertBinaryToDecimal(num);

    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
  }

  public static int convertBinaryToDecimal(long num) 
  {
    int decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}
