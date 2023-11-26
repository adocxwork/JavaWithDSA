#include<stdio.h>
int main()
{
    char str[] = "ThisIsAditya";
    printf("%s", str);
    for(int i=0; i<12; i++)
    {
        for(int j=0; j<12-i-1; j++)
        {
            if(str[j]>str[j+1])
            {
                char a = str[j];
                str[j] = str[j+1];
                str[j+1] = a;
            }
        }
    }
    printf("\n%s", str);
    return 0;
}