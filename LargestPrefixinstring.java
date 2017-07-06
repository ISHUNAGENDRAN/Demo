import java.util.Scanner;
public class LargestPrefixinstring
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        String largestPre="";
        String s1=arr[0];
        for(int i=0;i<s1.length();i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                String s2=arr[j];
                if(i<s2.length())
                if(s1.charAt(i)==s2.charAt(i))
                    count++;
                else
                    break;
            }
            if(count==arr.length)
            largestPre=largestPre+s1.charAt(i);
        }
        System.out.println(largestPre);
    }
}
