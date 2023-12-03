// WAP to concatenate 2 string
#include<stdio.h>
#include<string.h>
void conca(char *p1, char *p2)
{
    int i=0, j=0;
    while(*(p1+i)!='\0') i++;
    while(*(p1+i++)=*(p2+j++));
}
int main()
{
    char str1[] = "Hello";
    char str2[] = "ThisIsAditya";
    printf("%s", str1);
    conca(str1, str2);
    printf("\n%s", str1);
    return 0;
}