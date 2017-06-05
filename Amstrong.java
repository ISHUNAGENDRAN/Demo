import java.io.*;
import java.util.*;

class Amstrong {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,temp,sum=0;
        temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(n==sum)
        System.out.println("Armstrong");
        else
    System.out.println(" not Armstrong");
	}
}
