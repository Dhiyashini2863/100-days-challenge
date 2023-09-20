import java.io.*;
class Main {
  public static void main(String[] args)throws Exception
  {
     // create null, empty, and regular strings
    String str1,str2,str3;
    DataInputStream d = new DataInputStream(System.in);
    System.out.print("Enter the string:");
    str1 = d.readLine();
     // check if str1 is null or empty
    System.out.println("str1 is " + isNullEmpty(str1));
    System.out.print("Enter the string:");
    str2 = d.readLine();
    // check if str2 is null or empty
    System.out.println("str2 is " + isNullEmpty(str2));
    System.out.print("Enter the string:");
    str3 = d.readLine();
    // check if str3 is null or empty
    System.out.println("str3 is " + isNullEmpty(str3));
  }

  // method check if string is null or empty
  public static String isNullEmpty(String str) {

    // check if string is null
    if (str == null) {
      return "NULL";
    }

    // check if string is empty
    else if(str.isEmpty()){
      return "EMPTY";
    }

    else {
      return "neither NULL nor EMPTY";
    }
  }
}
