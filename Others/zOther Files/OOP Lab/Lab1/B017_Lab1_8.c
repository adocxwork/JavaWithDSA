#include<stdio.h>
char * stringCat(char s[], char t[])
{
    int i=0, j=0;
    while (s[i]!='\0') i++;
    while (s[i++]=t[j++]);
    return s;
}
int main()
{
    char a[] = "Aditya";
    char b[] = " Gupta";
    stringCat(a, b);
    printf("%s",a);
    return 0;
}
