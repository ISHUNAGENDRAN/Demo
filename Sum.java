import java.util.Scanner;

public class Sum
{
    public static void main(String args[])
    {
    int sum=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
        for(int i=0;i<n;i++)
        {
        sum=sum+i;
        }
        System.out.println(sum);
        }
        else if((n==0)||(n<0))
            System.out.println("invalid");
        }
        }
