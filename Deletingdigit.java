import java.util.*;
 
class Deletingdigit
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int p[]=new int[10];
      int i=0;
      while(n>0)
      {
          int temp=n%10;
          p[i++]=temp;
          n=n/10;
      }
 int g=i;
 System.out.println(g);
 int d[]=new int[g];
 System.arraycopy(p,0,d,0,g);
 Arrays.sort(d);
 for(int j=0;j<g-k;j++)
      System.out.println(d[j]);
   }
}
