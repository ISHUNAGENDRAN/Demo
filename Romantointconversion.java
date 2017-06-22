import java.io.*;

import java.util.*;


class Romantointconversion {
    
  
  public static void main(String args[])
  
  {
       
 Scanner sc=new Scanner(System.in);
       
 String s1=sc.nextLine();
      
  char a[]=s1.toCharArray();
       /* for(int i=0;i<a.length;i++)
        System.out.print(a[i]);*/
       
 int k,i;
     
   int len=a.length;
     
   for(i=0;i<len;i++)
      
  {
      
  if(a[i]=='I')
      
  a[i]=1;
      
  else if(a[i]=='V')
       
  a[i]=5;
  
else if(a[i]=='X')
  
 a[i]=10;
  
else if(a[i]=='L')
   
a[i]=50;
 
 else if(a[i]=='C')
   
a[i]=100;
 
 else if(a[i]=='D')
   
a[i]=500;
  
else if(a[i]=='M')
   
a[i]=1000;
   }
    
 k=a[len-1];
     
for(i=len-1;i>0;i--)
   
  {
        
 if(a[i]>a[i-1])
        
 k=k-a[i-1];
        
 else if((a[i]==a[i-1])||(a[i]<a[i-1]))
         
k=k+a[i-1];
     
}
    
 System.out.println("decimal value="+k);
        
}
    
 }
    
	
