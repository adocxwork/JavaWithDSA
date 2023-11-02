#include <stdio.h>
int main()
{
    int a = 0;
    for (int i=1; i<=7; i++)
    {
        if (i>4)
            a=a-2;
        for (int j = 1; j <= 7; j++)
        {
            if (j>=5-i && j<=3+i && j>=i-3 && j<=11-i)
            {

                if (j<=4)
                {
                    printf("%d", ++a);
                }
                else
                {
                    printf("%d", --a);
                }
            }
            else
                printf(" ");
        }
        printf("\n");
    }
    return 0;
}