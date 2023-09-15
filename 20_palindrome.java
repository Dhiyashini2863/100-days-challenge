import java.io.*;
class Main 
{
  public static void main(String[] args)throws Exception
  {
    String str, reverseStr = "";
    DataInputStream d = new DataInputStream(System.in);
    System.out.print("Enter the string:");
    str = d.readLine();
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) 
    {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) 
    {
      System.out.println(str + " is a Palindrome");
    }
    else
    {
      System.out.println(str + " is not a Palindrome");
    }
  }
}
