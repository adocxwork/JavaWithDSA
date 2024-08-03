#include<stdio.h>
int stringLen(char str[])
{
    int i;
    for(i=0; str[i]!='\0'; i++);
    return i;
}
int main()
{
    char a[] = "Aditya";
    printf("%d", stringLen(a));
    return 0;
}
