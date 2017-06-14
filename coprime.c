#include<stdio.h>
#include<conio.h>
void main()
{
int no1,no2,temp,temp1,temp2;
clrscr();
printf("Enter the numbers");
scanf("%d%d",&no1,&no2);
temp1=no1;
temp2=nno2;
while(no2!=0)
{
temp=no1%no2;
no1=no2;
no2=temp;
}
if(no1==1)
printf("\n the %d and %d is coprime",temp1,temp2);
else
printf("\n the %d and %d is not coprime",temp1,temp2);
getch();
}
