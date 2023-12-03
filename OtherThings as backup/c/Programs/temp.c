#include<stdio.h>
#include<string.h>
int add(int a, int b, int c)
{
    return a+b+c;
}
void main()
{
    char str1[] = "Aditya";
    char str2[] = "Gupta";
    strcat(str1,str2);
    printf("%s", str1);
    printf("%s", str2);
}