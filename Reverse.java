import java.util.Scanner;
 
class Reverse
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
      String s1=sc.next();
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
System.out.println(sb);
}

   
}
