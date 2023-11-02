#include<stdio.h>
int main()
{
    for(int i=0; i<6; i++)
    {
        for(int j=0; j<10; j++)
        {
            if((2*i+j)<=4)
            printf("*");
            else if((j-2*i)>=5)
            printf("*");
            else if(j-2*i<=-6)
            printf("%d", 8-i);
            else if(j+2*i>=15)
            printf("%d", i-2);
            else
            printf(" ");
        }
        printf("\n");
    }
    return 0;
}