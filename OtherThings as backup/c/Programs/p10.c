// WAP to copy string into another string
#include<stdio.h>
#include<string.h>
void strcppy(char *p1, char *p2)
{
    int i=0;
    while (*(p2+i)!='\0')
    {
        *(p1+i)=*(p2+i);
        i++;
    }
}
int main()
{
    char str1[100] = "Hello";
    char str2[100] = "ThisIsAditya";
    printf("%s", str1);
    strcppy(&str1, &str2);
    printf("\n%s", str1);
    return 0;
}