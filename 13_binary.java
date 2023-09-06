import java.io.*;
class binary
{
 int a[]=new int[10];
 int n,i,j,c,se,start,end,mid,min;
 void input()throws Exception
 {
  DataInputStream d=new DataInputStream(System.in);
  System.out.print("Enter the no of elements:");
  n=Integer.parseInt(d.readLine());
  System.out.print("Enter the elements");
  for(i=0;i<n;i++)
     a[i]=Integer.parseInt(d.readLine());
  System.out.print("Enter the elements to be searched:");
  se=Integer.parseInt(d.readLine());
  }
 void sort()
 {
  for(i=0;i<n-1;i++)
    {
    min=i;
    for(j=i+1;j<n;j++)
       {
        if(a[min]>a[j])
           min=j;
       }
        if(min!=i)
         {
            c=a[min];
   	    a[min]=a[i];
            a[i]=c;
          }
      }
  }
 void print()
 {
  start=0;end=n-1;
  for(;start<=end;)
   {
     mid=(start+end)/2;
     if(a[mid]==se)
       break;
     else if(a[mid]>se)
        end=mid-1;
     else
        start=mid+1;
   }
   if(start<=end)
      System.out.println("Element found");
   else
      System.out.println("Element not found");
  }
}
class main
{
  public static void main(String a[])throws Exception
  {
   binary p=new binary();
   p.input();
   p.sort();
   p.print();
  }
}
      
 
     
 
  
 
