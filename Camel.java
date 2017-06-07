import java.util.*;
class Camel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        for(String w:s1.split(" "))
        {
           sb.append(Character.toUpperCase(w.charAt(0))); 
        if(w.length()>1)
        {
            sb.append(w.substring(1,w.length()).toLowerCase());
        }
        sb.append(" ");
        }
        System.out.println(sb);
    }
}
