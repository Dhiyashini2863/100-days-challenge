import java.io.*;
class hello extends Exception
{
 public String toString()
 {
   return "You are input the word \"hello\".Please enter other than \"hello\"";
 }
}
class sample
{
 public static void main(String ad[])
 {
  String a,b="hello";
  try
  {
   
   DataInputStream d=new DataInputStream(System.in);
   System.out.println("Enter the string:");
   a=d.readLine();
   if(a.equals(b))
     throw new hello();
   else
     System.out.println("Input does not have the word\"hello\"");
  }
  catch(IOException e)
  {
   }
  catch(hello e)
   {
    System.out.println(e);
   }
  catch(Exception e)
  {
    System.out.println("some exception occurs");
  }
  finally
  {
   System.out.println("code executed");
  }
}
}


  
