import java.util.Scanner;
 
class Prime
{
   public static void main(String args[])
   {
      int x,f=0;
      System.out.println("Enter number ");
      Scanner in = new Scanner(System.in);
       x=in.nextInt();
      for(int i=2;i<x/2;i++)
      {
          if(x%i==0)
          { 
              f=1;
              break;
          }
          
      }
      if(f==0)
     
      System.out.println("Prime");
      else
      System.out.println(" not Prime");
   }
