import java.util.*;
class Charincr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next(); 
        int i,j;
        for(i=0;i<s1.length();i++)
        {
            int x=(int)s1.charAt(i)+10;
            System.out.print((char)x);
        }
        System.out.print(" ");
        for(i=0;i<s2.length();i++)
        {
            if(i==0)
            System.out.print(s2.charAt(i));
            else if(i==s2.length()-1)
               System.out.print(s2.charAt(i)); 
            
            else if(i==1)
            {
              int z=(int)s2.charAt(i)+10;
            System.out.print((char)z);  
            }
            else 
            {
              int z=(int)((s1.charAt(i)+10)-26);
            System.out.print(Character.toLowerCase((char)z));  
            }
            
            
            
        }
    }
}
