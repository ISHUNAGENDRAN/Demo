import java.util.*;
class Camelcasechecks
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
	    System.out.println("ENTER THE STRING");
		String s1=in.nextLine();	
        int flag=0;
        String w[]=s1.split(" ");
        int i;
        for(i=0;i<w.length;i++)
        {
            if(Character.isUpperCase(w[i].charAt(0))==true)
            flag++;
            
        }
        if(w.length==flag)
         System.out.println("IT IS A CAMEL CASE");
         else
          System.out.println("IT IS A  NOT CAMEL CASE");
        

    }
}
