#include<stdio.h>
#include<string.h>
int main()
{
    char arr[] = {'G','e','r','m','a','n','\0'};
    int i=0;
    while(arr[i]!='\0')
    {
        i++;
    }
    printf("%d\n", i);
    printf("%d\n", strlen(arr));
    return 0;
}