// C++ program to find repeating sequence in a fraction
import java.util.*;
class Happyno
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,temp;
        while(n>0)
        {
            temp=n%10;
            sum=sum+(temp*temp);
            n=n/10;
        
        if(n==0 && sum!=1)
        {
            n=sum;
            sum=0;
        }
        }
        if(sum==1)
        System.out.print("happy no");
        else
        System.out.print(" not happy no");
    }
}
