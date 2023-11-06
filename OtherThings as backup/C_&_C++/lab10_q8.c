#include<stdio.h>
void main()
{
    int i,j,k=0,c,n=4,m=7;
    for(i=1;i<=n;i++)
    {c=i-1;
        for(j=1;j<=m;j++)
        {   if(j>=5-i&&j<=i+3)
                {
                    if(j<=4)
                        printf("%d",++c);
                    else
                        printf("%d",--c);
                }

            else
                printf(" ");
        }
       printf("\n");
    }
n--;
for(i=1;i<=n;i++)
    {c=c-2;
        for(j=1;j<=m;j++)
        {   if(j>i&&j<8-i)
                {
                    if(j<=4)
                        printf("%d",++c);
                    else
                        printf("%d",--c);
                }

            else
                printf(" ");
        }
       printf("\n");
    }



}