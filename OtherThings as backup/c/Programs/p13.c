// to find length of string
#include<stdio.h>
int main()
{
    char s[] = "Aditya";
    int i=0;
    while(s[i]!='\0')
    i++;
    printf("%d", i);
}