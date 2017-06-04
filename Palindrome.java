import java.util.Scanner;
 
class Palindrome
{
   public static void main(String args[])
   {
      int x,temp,sum=0;
      System.out.println("Enter number ");
      Scanner in = new Scanner(System.in);
       x=in.nextInt();
      temp=x;
      while(temp!=0)
      {
          sum=sum*10;
          sum=sum+(temp%10);
          temp=temp/10;
           
      }
      if(x==sum)
     
      System.out.println("Pallindrome");
      else
      System.out.println(" not Pallindrome");
   }
}
