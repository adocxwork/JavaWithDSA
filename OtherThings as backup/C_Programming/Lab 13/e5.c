// not complete...
#include<stdio.h>
#include<string.h>
int main()
{
    int min=0, max=0, maxC=0, minC=0;
    char str[] = "Engineering";
    printf("%s\n", str);
    int fre[1000];
    for(int i=0; i<strlen(str); i++)
    {
        fre[str[i]]++;
    }
    for(int i=0; i<1000; i++)
    {
        if(fre[i]>maxC)
        {
            maxC=fre[i];
            max=i;
        }
    }
    minC=maxC;
    for(int i=0; i<1000; i++)
    {
        if(fre[i]<minC && fre[i]!=0)
        {
            minC=fre[i];
            min = i;
        }
    }
    printf("The max count : %c\n", maxC);
    printf("The min count : %c\n", minC);
    return 0;
}