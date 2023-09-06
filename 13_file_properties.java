import java.util.*;
import java.io.*;
class file
{
 public static void main(String ad[])throws Exception
 {
   File f=new File("cse.txt");
   if(!f.exists())
      System.out.println("File does not exist");
   else
      System.out.println("PROPERTIES OF FILE");
      System.out.println("Path="+f.getPath());
      System.out.println("Absolute path="+f.getAbsolutePath());
      System.out.println("Exists File="+f.exists());
      System.out.println("Path Name="+f.getName());
      System.out.println("New File or Existing File="+f.createNewFile());
      System.out.println("Readable="+f.canRead());
      System.out.println("Writable="+f.canWrite());
      System.out.println("Last Modified="+new Date(f.lastModified()));
      System.out.println("File Length="+f.length());
      System.out.println("ExecutbleFile="+f.canExecute());
      System.out.println("File="+f.isFile());
      System.out.println("File copy");
      FileInputStream f1=new FileInputStream(f);
      FileOutputStream f2=new FileOutputStream("dhiya.txt");
      byte c;
      while(f1.available()>0)
      {
        c=(byte)f1.read();
        f2.write(c);
        System.out.print((char)c);
      }
       f1.close();
       f2.close();
   }
}

      
      
      
