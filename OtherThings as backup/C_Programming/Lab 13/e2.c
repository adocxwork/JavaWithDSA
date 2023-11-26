#include<stdio.h>
#include<string.h>
int main()
{
    char str[] = "ThisIsAditya";
    printf("%s", str);
    for(int i=0; i<strlen(str); i++)
    {
        if(str[i]>=65 && str[i]<91)
        {
            str[i] = str[i]-65+97;
        }
        else
        {
            str[i] = str[i]+65-97;
        }
    }
    printf("\n%s", str);
    return 0;
}