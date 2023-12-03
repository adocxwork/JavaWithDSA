#include<stdio.h>
#include<string.h>
int main()
{
    char str[] ="ThisIsAditya";
    printf("%s\n", str);
    for(int i=0; i<strlen(str); i++)
    {
        if(str[i]>=65 && str[i]<=(65+25)) str[i] = str[i] -65 + 97;
        else str[i] = str[i] -97 +65;
    }
    printf("%s\n", str);
    return 0;
}