#include<stdio.h>
int main()
{
    char str[] = "ThisIsAditya";
    printf("%s", str);
    char *p = str;
    for(int i=0; i<12; i++)
    {
        for(int j=0; j<12-i-1; j++)
        {
            if(*(p+j) > *(p+j+1))
            {
                char t = *(p+j);
                *(p+j) = *(p+j+1);
                *(p+j+1) = t;
            }
        }
    }
    printf("\n%s", str);
    return 0;
}