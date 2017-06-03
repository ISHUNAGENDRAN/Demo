import java.util.Scanner;
 
class Countdigits
{
   public static void main(String args[])
   {
      int x=0;
      System.out.println("Enter number ");
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      while(n!=0)
      {
          int temp=n%10;
          n=n/10;
          x++;
      }
 
      System.out.println("count"+" "+x);
   }
}
