import java.util.*;
class repeatchar
{
    public static void main(String args[])
    {
        {
        Scanner in=new Scanner(System.in);
    	System.out.println("ENTER THE STRING");
   		String s=in.nextLine();
        char[] c=s.toCharArray();

        for(int i=0;i<s.length();i++)
        {
            int flag=0;
        	char ch=s.charAt(i);
        	for(int j=0;j<s.length();j++)
        	{
        		if(ch==c[j])
        		{
        			flag++;
        		}
        	}
        	if(flag==1)
        	{
        		System.out.print(c[i]);
        	}
        }
       
        
        }
    }
}
