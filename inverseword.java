import java.util.*;
class inverseword
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String w[]=s1.split(" ");
        for(int i=w.length-1;i>=0;i--)
        {
            System.out.print(w[i]+" ");
        }
    }
}
