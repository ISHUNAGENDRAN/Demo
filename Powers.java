import java.util.Scanner;
 
class Powers
{
   public static void main(String args[])
   {
      int result=1;
      System.out.println("Enter number base and exponent ");
      Scanner in = new Scanner(System.in);
      int base=in.nextInt();
      int exponent=in.nextInt();
      for(int i=0;i<exponent;i++)
      {
          int temp=base;
           result=result*temp;
      }
 
      System.out.println("result"+" "+result);
   }
}
