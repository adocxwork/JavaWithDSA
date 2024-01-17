#include<stdio.h>
char stringCat(char s, char t)
{
    int i, j=0;
    for(i=0; s+i!='\0'; i++);
    for(; t+j!='\0'; i++, j++)
    {
        s[i]=t[j];
    }
    return s;
}
int main()
{
    char a[] = "Aditya";
    char b[] = " Gupta";
    a = stringCat(a, b);
    printf("%s",a);
    return 0;
}
