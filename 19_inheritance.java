import java.io.*;
class first
{
  int a=5;
  void show()
  {
    System.out.print("Hii I am "+a);
  }
}
class second extends first
{
  int a=10;
  void show()
  {
   System.out.print("Hii I am also "+super.a);
  }
}
class main
{
 public static void main(String d[])throws Exception
 {
    first p;
    first p1=new first();
    p1.show();
 }
}
