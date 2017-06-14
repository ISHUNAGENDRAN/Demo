import java.util.*;
public class Swapevenoddstring
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
 String p=sc.next();
 //char p1[]=p.toCharArray();
String even="";

for(int i=0;i<p.length()-1;i=i+2)
{
even=even+p.charAt(i+1);
even=even+p.charAt(i);
}
 if(p.length()%2!=0)
{
System.out.print(even+p.charAt(p.length()-1));
}
else
System.out.print(even);
}
}
