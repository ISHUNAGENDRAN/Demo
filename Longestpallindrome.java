import java.util.*;
public class Longestpallindrome {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	ArrayList<Integer> a1=new ArrayList<Integer>();
	ArrayList<String> a2=new ArrayList<String>();
	int i,j;
	for(i=0;i<s1.length();i++)
	{
		for(j=i;j<s1.length();j++)
		{
			
		
	
	StringBuffer sb=new StringBuffer(s1.substring(i,j));
	sb.reverse();
	String alter=new String(sb);
	if(alter.equals(s1.substring(i,j)))
	{
		if(alter.length()!=1)
		{
			a1.add(alter.length());
			a2.add(alter);
		}
	}
}
}
	Collections.sort(a1);
	int large=a1.get(a1.size()-1);
	for(String ff:a2)
	{
		if(ff.length()==large)
		{
			System.out.println(ff);
		}
	}
}
}
