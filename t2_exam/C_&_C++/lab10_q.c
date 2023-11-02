#include<stdio.h>
void main()
{
    int i,j,k=0,c=0;
    for(i=1;i<=9;i++)
    {k=0;c=9;
        for(j=1;j<=10;j++)
        {   if(i>j)
               printf("%d",c--);
            else
            printf("%d",k++);
        }
       printf("\n");
    }

}