#include<stdio.h>
int main()
{
    char s1[20] = "Hello";
    char s2[20] = "ThisIsAditya";
    printf("\n%s", s1);
    char *p1 = s1;
    char *p2 = s2;
    int i=0, j=0;
    while(s1[i]!='\0')
    {
        i++;
        p1++;
    }
    while (s2[j]!='\0')
    {
        *p1 = *p2;
        j++;
        p1++;
        p2++;
    }
    printf("\n%s", s1);
    return 0;
}