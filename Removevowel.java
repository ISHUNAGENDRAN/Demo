import java.util.*;
class Removevowel
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    
     
            String str =sc.next();
            String resustr = str.replaceAll("[aeiouAEIOU]", "");
            System.out.println(resustr);
     
        }
     
    }
