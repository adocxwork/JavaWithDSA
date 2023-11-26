#include<stdio.h>
int main()
{
    char str1[] = "Hello";
    char str2[] = "ThisI";
    char *p1 = str1;
    char *p2 = str2;
    int i=0,j=0;
    while (*(p1+i)!='\0')
    {
        i++;
    }
    while (str1[i++]=str2[j++]);
    printf("%s", str1);
    return 0;
}